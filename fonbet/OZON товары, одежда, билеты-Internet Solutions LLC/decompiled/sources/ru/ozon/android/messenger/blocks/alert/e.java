package ru.ozon.android.messenger.blocks.alert;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.b;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.m;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MBlockAlertBinding;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes10.dex */
public final class e extends ru.ozon.android.messenger.framework.core.viewmapper.b<AlertDTO, g, MBlockAlertBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f84385b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, AlertDTO> f84386c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f84387d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f84388e;

    static final class a extends AbstractC7737t implements Function0<c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84389b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return new c();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, AlertDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f84390b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AlertDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (AlertDTO) this.f84390b.fromJson(state, AlertDTO.class);
        }
    }

    public e(@NotNull JsonParser deserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84385b = context;
        this.f84386c = new b(deserializer);
        this.f84387d = ru.ozon.android.messenger.utils.f.b(a.f84389b);
    }

    public static final Map n(e eVar, g gVar) {
        eVar.getClass();
        String a11 = d.c.ACTION_ERROR_FLASHBAR.a();
        int i11 = R$string.messenger_error_smth_went_wrong_try_later;
        Context context = eVar.f84385b;
        String d11 = ru.ozon.android.messenger.utils.c.d(i11, context);
        int i12 = R$drawable.ic_m_info;
        String resourceEntryName = context.getResources().getResourceEntryName(R$color.bg_attention_primary);
        Intrinsics.checkNotNullExpressionValue(resourceEntryName, "getResourceEntryName(...)");
        return U.j(new Pair(a11, new m(d11, i12, resourceEntryName)), new Pair("itemId", h.b(gVar)));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MBlockAlertBinding mBlockAlertBinding, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MBlockAlertBinding binding = mBlockAlertBinding;
        g viewObject = gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).addView(binding.getConstraintLayout(), 0);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonControlSettings common2;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        MBlockAlertBinding binding = (MBlockAlertBinding) aVar;
        g viewObject = (g) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = references.c();
        B0 b02 = this.f84388e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        if (viewObject.b() != null) {
            b.C1565b g10 = g(rootView);
            this.f84388e = g10 != null ? C10727i.c(K.a(g10), null, null, new f(viewObject, c11, null), 3) : null;
        }
        DisclaimerView disclaimer = binding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        DSDisclaimerHolderKt.bind(disclaimer, viewObject.a(), new d(references, viewObject, this));
        DisclaimerDTO a11 = viewObject.a();
        Map<String, TokenizedTrackingInfo> trackingInfo3 = a11.getTrackingInfo();
        if (trackingInfo3 != null) {
            references.c().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo3));
        }
        DisclaimerDTO.MainButton mainButton = a11.getMainButton();
        if (mainButton != null && (common2 = mainButton.getCommon()) != null && (trackingInfo2 = common2.getTrackingInfo()) != null) {
            references.c().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo2));
        }
        DisclaimerDTO.AdditionalButton additionalButton = a11.getAdditionalButton();
        if (additionalButton == null || (common = additionalButton.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) {
            return;
        }
        references.c().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (c) this.f84387d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AlertDTO> getParser() {
        return this.f84386c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MBlockAlertBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockAlertBinding inflate = MBlockAlertBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MBlockAlertBinding mBlockAlertBinding, ru.ozon.android.messenger.framework.core.d references) {
        MBlockAlertBinding binding = mBlockAlertBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).removeView(binding.getConstraintLayout());
    }
}
