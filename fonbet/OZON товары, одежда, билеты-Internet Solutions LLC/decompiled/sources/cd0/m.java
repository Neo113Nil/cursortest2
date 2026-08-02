package cd0;

import Jb0.r;
import Sc.InterfaceC4008j;
import Ve.Lq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import dd0.C6181a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import td0.C9861a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcd0/m;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f56980a;

    public static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f56982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(0);
            this.f56982c = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new l(m.this, this.f56982c);
        }
    }

    public m() {
        super(R.layout.fragment_ozon_id_page_social_add_options);
        a aVar = new a(this);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f56980a = b0.b(this, N.b(n.class), new Bc0.m(a11), new Bc0.n(a11), aVar);
    }

    public static void t(m mVar, b.c cVar) {
        n nVar = (n) mVar.f56980a.getValue();
        J viewLifecycleOwner = mVar.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        nVar.a1(cVar, viewLifecycleOwner);
    }

    public static void u(m mVar, EntryDTO.EntryButtonDTO entryButtonDTO) {
        ((n) mVar.f56980a.getValue()).Y0(entryButtonDTO);
    }

    public static void v(m mVar, EntryDTO.EntryButtonDTO entryButtonDTO) {
        ((n) mVar.f56980a.getValue()).Y0(entryButtonDTO);
    }

    public static final void w(m mVar, r rVar, C6181a c6181a) {
        TextAtomV2View titleTextAtomView = rVar.f14541f;
        Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
        OzonSpannableString e11 = c6181a.e();
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.LEADING;
        TextHolderKt.bindOrGone$default(titleTextAtomView, new TextDTO(e11, textAlignment, null, null, null, null, TextPreset.UI_H1, null, null, null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 262076, null), null, 2, null);
        OzonSpannableString d11 = c6181a.d();
        if (d11 != null) {
            OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
            Context context = mVar.getContext();
            Integer valueOf = context != null ? Integer.valueOf(context.getColor(R.color.text_action)) : null;
            i iVar = new i(1, (n) mVar.f56980a.getValue(), n.class, "onLinkClick", "onLinkClick(Ljava/lang/String;)V", 0);
            TextAtomV2View descriptionTextAtomView = rVar.f14538c;
            OzonUrlSpan.Companion.configUrlSpans$default(companion, d11, null, valueOf, null, new Pair(descriptionTextAtomView, iVar), 5, null);
            Intrinsics.checkNotNullExpressionValue(descriptionTextAtomView, "descriptionTextAtomView");
            TextHolderKt.bind$default(descriptionTextAtomView, new TextDTO(d11, textAlignment, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, OzonSpannableStringKt.hasClickableSpan(d11), null, null, null, null, Integer.MAX_VALUE, 253628, null), null, 2, null);
        }
        EntryDTO.EntryButtonDTO c11 = c6181a.c();
        ButtonV3View submitButton = rVar.f14540e;
        if (c11 != null) {
            ButtonV3HolderKt.bindOrGone$default(submitButton, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_600, c11.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
            C9861a.a(submitButton, "submitButton");
            submitButton.setOnClickListener(new Lq(2, mVar, c11));
        } else {
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            ViewExtKt.gone(submitButton);
        }
        b.c b11 = c6181a.b();
        ButtonV3View socialButton = rVar.f14539d;
        if (b11 != null) {
            String string = mVar.getString(b11.d());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ButtonV3HolderKt.bindOrGone$default(socialButton, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_600, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
            C9861a.a(socialButton, "submitButton");
            socialButton.setOnClickListener(new IK.a(3, mVar, b11));
        } else {
            Intrinsics.checkNotNullExpressionValue(socialButton, "socialButton");
            ViewExtKt.gone(socialButton);
        }
        EntryDTO.EntryButtonDTO a11 = c6181a.a();
        ButtonV3View cancelButton = rVar.f14537b;
        if (a11 == null) {
            Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
            ViewExtKt.gone(cancelButton);
        } else {
            ButtonV3HolderKt.bindOrGone$default(cancelButton, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, ButtonV3DTO.Sizes.SIZE_600, a11.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
            C9861a.a(cancelButton, "cancelButton");
            cancelButton.setOnClickListener(new FV.a(1, mVar, a11));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        r a11 = r.a(view);
        n nVar = (n) this.f56980a.getValue();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new j(viewLifecycleOwner, null, nVar, this, a11), 3);
    }
}
