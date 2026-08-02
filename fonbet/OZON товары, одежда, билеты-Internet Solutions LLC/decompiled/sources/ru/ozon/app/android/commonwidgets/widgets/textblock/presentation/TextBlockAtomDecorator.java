package ru.ozon.app.android.commonwidgets.widgets.textblock.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.SocialAtomType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/TextBlockAtomDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "", "position", "", "last", "modifyVerticalLayoutParams", "(Landroid/widget/LinearLayout$LayoutParams;Lru/ozon/uni/atoms/data/AtomDTO;IZ)Landroid/widget/LinearLayout$LayoutParams;", "verticalMargin", "I", "getVerticalMargin", "()I", "setVerticalMargin", "(I)V", "Companion", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockAtomDecorator extends AtomDecorator implements VerticalAtomsDecorator {
    private static final int DEFAULT_MARGIN = ResourceExtKt.toPx(12);
    private static final int TEXT_ATOM_HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);

    @NotNull
    private static final HashSet<? extends Object> textAtomsTypes = e0.a(AtomTypeImpl.TEXT_ATOM, SocialAtomType.SOCIAL_TEXT_ATOM);
    private int verticalMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextBlockAtomDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.verticalMargin = DEFAULT_MARGIN;
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (position != 0) {
            setTop(lp, this.verticalMargin);
        }
        if (C7714v.A(textAtomsTypes, data.getType())) {
            int i11 = TEXT_ATOM_HORIZONTAL_MARGIN;
            setLeft(lp, i11);
            setRight(lp, i11);
        }
        return lp;
    }

    public final void setVerticalMargin(int i11) {
        this.verticalMargin = i11;
    }
}
