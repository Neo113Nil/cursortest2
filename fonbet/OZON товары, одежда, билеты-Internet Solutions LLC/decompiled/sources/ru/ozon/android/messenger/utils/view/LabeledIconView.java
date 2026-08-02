package ru.ozon.android.messenger.utils.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MLabeledIconViewBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/utils/view/LabeledIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LabeledIconView extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final MLabeledIconViewBinding f91997c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91998a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91998a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledIconView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        MLabeledIconViewBinding inflate = MLabeledIconViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f91997c = inflate;
    }

    public final void b(e eVar, @NotNull d.a networkConfig) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        if (eVar == null) {
            s.a(this);
            return;
        }
        MLabeledIconViewBinding mLabeledIconViewBinding = this.f91997c;
        AppCompatImageView labeledIcon = mLabeledIconViewBinding.labeledIcon;
        Intrinsics.checkNotNullExpressionValue(labeledIcon, "labeledIcon");
        ru.ozon.android.messenger.utils.image.c.c(labeledIcon, eVar.a(), networkConfig);
        TextAtomV2View labeledText = mLabeledIconViewBinding.labeledText;
        Intrinsics.checkNotNullExpressionValue(labeledText, "labeledText");
        TextHolderKt.bindOrGone$default(labeledText, eVar.c(), null, 2, null);
        c b11 = eVar.b();
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        int i13 = a.f91998a[b11.ordinal()];
        if (i13 == 1) {
            dVar.o(R$id.labeledIcon, 7);
            dVar.o(R$id.labeledText, 6);
            dVar.s(R$id.labeledIcon, 6, 0, 6);
            int i14 = R$id.labeledText;
            int i15 = R$id.labeledIcon;
            i11 = ru.ozon.android.messenger.utils.e.f91905b;
            dVar.t(i14, 6, i15, 7, i11);
        } else {
            if (i13 != 2) {
                throw new Sc.o();
            }
            dVar.o(R$id.labeledIcon, 6);
            dVar.o(R$id.labeledText, 6);
            dVar.s(R$id.labeledText, 6, 0, 6);
            int i16 = R$id.labeledIcon;
            int i17 = R$id.labeledText;
            i12 = ru.ozon.android.messenger.utils.e.f91905b;
            dVar.t(i16, 6, i17, 7, i12);
        }
        dVar.f(this);
        s.d(this);
    }
}
