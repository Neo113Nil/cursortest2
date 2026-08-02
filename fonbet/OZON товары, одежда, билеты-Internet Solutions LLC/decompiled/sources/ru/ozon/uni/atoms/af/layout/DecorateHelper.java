package ru.ozon.uni.atoms.af.layout;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.CommonAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J%\u0010\u0014\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u0002H\u0015¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "allowCanvasDecoration", "", "childBound", "Landroid/graphics/Rect;", "debugHelper", "Lru/ozon/uni/atoms/af/layout/DebugAtomHelper;", "decorate", "", "parent", "Landroid/view/ViewGroup;", "canvas", "Landroid/graphics/Canvas;", "decorator", "Lru/ozon/uni/atoms/af/CommonAtomDecorator;", "processLp", "LP", "Landroid/view/ViewGroup$LayoutParams;", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "lp", "(Lru/ozon/uni/atoms/data/AtomDTO;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "lockDecoration", "unLockDecoration", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DecorateHelper {
    private boolean allowCanvasDecoration;

    @NotNull
    private final Rect childBound;
    private final DebugAtomHelper debugHelper;

    public DecorateHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.childBound = new Rect();
        this.debugHelper = null;
    }

    public final void decorate(@NotNull ViewGroup parent, @NotNull Canvas canvas, @NotNull CommonAtomDecorator decorator) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(decorator, "decorator");
        if (this.allowCanvasDecoration) {
            int childCount = parent.getChildCount();
            canvas.save();
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = parent.getChildAt(i11);
                childAt.getDrawingRect(this.childBound);
                parent.offsetDescendantRectToMyCoords(childAt, this.childBound);
                decorator.decorate(canvas, this.childBound, i11, i11 == childCount + (-1));
                i11++;
            }
            canvas.restore();
        }
    }

    public final void lockDecoration() {
        this.allowCanvasDecoration = false;
    }

    @NotNull
    public final <LP extends ViewGroup.LayoutParams> LP processLp(@NotNull AtomDTO data, @NotNull LP lp) {
        List list;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (data instanceof Button) {
            list = DecorateHelperKt.buttonsAlwaysWrap;
            if (list.contains(((Button) data).getStyle()) && ((ViewGroup.LayoutParams) lp).width != -2) {
                ((ViewGroup.LayoutParams) lp).width = -2;
            }
        }
        return lp;
    }

    public final void unLockDecoration() {
        this.allowCanvasDecoration = true;
    }
}
