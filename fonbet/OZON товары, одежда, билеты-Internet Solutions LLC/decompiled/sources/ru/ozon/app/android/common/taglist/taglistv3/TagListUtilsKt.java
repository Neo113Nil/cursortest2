package ru.ozon.app.android.common.taglist.taglistv3;

import A00.a;
import El.C2971a;
import T00.a;
import T00.e;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Li10/l$a;", "loaderType", "", "refreshAndScroll", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;Lru/ozon/app/android/composer/ComposerReferences;Li10/l$a;)V", "Landroid/content/Context;", "context", "", "color", "Landroid/graphics/drawable/ShapeDrawable;", "getRoundedBackground", "(Landroid/content/Context;I)Landroid/graphics/drawable/ShapeDrawable;", "Ll20/d;", "widgetInfo", "getLoaderType", "(Ll20/d;)Li10/l$a;", "taglist_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagListUtilsKt {
    @NotNull
    public static final l.a getLoaderType(d dVar) {
        a b11;
        e h11;
        return Intrinsics.d((dVar == null || (b11 = dVar.b()) == null || (h11 = b11.h()) == null) ? null : h11.e(), "dialog_search") ? new l.a.b(0L, null, 3) : new l.a.C1079a(0L, null, 3);
    }

    @NotNull
    public static final ShapeDrawable getRoundedBackground(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float pxF = ResourceExtKt.toPxF(24);
        shapeDrawable.setShape(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF}, null, null));
        shapeDrawable.getPaint().setColor(androidx.core.content.a.getColor(context, i11));
        return shapeDrawable;
    }

    public static final void refreshAndScroll(@NotNull AtomAction.Refresh refresh, @NotNull ComposerReferences refs, @NotNull l.a loaderType) {
        AppBarLayout composerAppbar;
        Intrinsics.checkNotNullParameter(refresh, "<this>");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        InterfaceC7851b.a.a(refs.getController(), refresh.getLink(), null, null, new h.b(new a.C.C0000a(0, false), loaderType), 6);
        ViewGroup b11 = C2971a.b(refs);
        if (b11 == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(b11)) == null) {
            return;
        }
        composerAppbar.s(true);
    }
}
