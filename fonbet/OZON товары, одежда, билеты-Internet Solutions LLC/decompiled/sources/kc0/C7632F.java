package kc0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.id.core.FeatureFlagConf;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xc0.C10702a;
import zc0.C11087b;
import zc0.C11088c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$load$1", f = "EntryCredentialsViewModel.kt", l = {282}, m = "invokeSuspend")
/* renamed from: kc0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7632F extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71283d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7629C f71284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7632F(C7629C c7629c, kotlin.coroutines.d<? super C7632F> dVar) {
        super(2, dVar);
        this.f71284e = c7629c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7632F(this.f71284e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7632F) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object p11;
        Function1 function1;
        C11087b c11087b;
        b.d dVar;
        b.c cVar;
        EntryDTO.InputDTO inputDTO;
        EntryDTO.InputDTO inputDTO2;
        String value;
        CharSequence A02;
        Object obj2;
        b.c cVar2;
        Boolean webViewForceCastHttpToHttps;
        Boolean forceMobileIdOverCellular;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71283d;
        C7629C c7629c = this.f71284e;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7629C.Y0(c7629c).p();
            C7629C.l1(c7629c);
            C10702a c10702a = (C10702a) c7629c.f71239v.getValue();
            String U02 = C7629C.U0(c7629c);
            this.f71283d = 1;
            p11 = c10702a.p(U02, this);
            if (p11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            p11 = obj;
        }
        EntryDTO dto = (EntryDTO) p11;
        function1 = c7629c.f71215D;
        EntryDTO.FeatureFlags featureFlags = dto.getFeatureFlags();
        boolean booleanValue = (featureFlags == null || (forceMobileIdOverCellular = featureFlags.getForceMobileIdOverCellular()) == null) ? false : forceMobileIdOverCellular.booleanValue();
        EntryDTO.FeatureFlags featureFlags2 = dto.getFeatureFlags();
        ArrayList arrayList = null;
        String allowedWebViewDomains = featureFlags2 != null ? featureFlags2.getAllowedWebViewDomains() : null;
        EntryDTO.FeatureFlags featureFlags3 = dto.getFeatureFlags();
        boolean booleanValue2 = (featureFlags3 == null || (webViewForceCastHttpToHttps = featureFlags3.getWebViewForceCastHttpToHttps()) == null) ? true : webViewForceCastHttpToHttps.booleanValue();
        EntryDTO.FeatureFlags featureFlags4 = dto.getFeatureFlags();
        function1.invoke(new FeatureFlagConf(booleanValue, allowedWebViewDomains, booleanValue2, featureFlags4 != null ? featureFlags4.getShouldLogSharedSessionError() : null));
        c11087b = c7629c.f71245y;
        c11087b.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        EntryDTO.AlertEntry alertEntry = dto.getAlertEntry();
        EntryDTO.Biometry biometry = alertEntry != null ? alertEntry.getBiometry() : null;
        EntryDTO.SocialLoginDTO socialLogin = dto.getSocialLogin();
        if (socialLogin != null) {
            Intrinsics.checkNotNullParameter(socialLogin, "<this>");
            List<EntryDTO.SocialButtonDTO> buttons = socialLogin.getButtons();
            ArrayList arrayList2 = new ArrayList();
            for (EntryDTO.SocialButtonDTO socialButtonDTO : buttons) {
                EntryDTO.b type = socialButtonDTO.getType();
                int i12 = type == null ? -1 : C11088c.a.f108794b[type.ordinal()];
                if (i12 == -1) {
                    cVar2 = null;
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new Sc.o();
                    }
                    cVar2 = new b.c(R.string.ozonid_login_with_vk_id_android, socialButtonDTO.getType(), socialButtonDTO.getLogo(), socialButtonDTO.getAuthUriAction(), socialButtonDTO.getRedirectUriAction());
                }
                if (cVar2 != null) {
                    arrayList2.add(cVar2);
                }
            }
            dVar = arrayList2.isEmpty() ? null : new b.d(socialLogin.getTitle(), arrayList2);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Iterator<T> it = dVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((b.c) obj2).e() == EntryDTO.b.VKID_ONE_TAP) {
                    break;
                }
            }
            cVar = (b.c) obj2;
        } else {
            cVar = null;
        }
        String B02 = kotlin.text.h.B0(dto.getTitle(), '\n');
        OzonSpannableString subtitle = dto.getSubtitle();
        OzonSpannableString ozonSpannableString = (subtitle == null || (A02 = kotlin.text.h.A0(subtitle, '\n')) == null) ? null : OzonSpannableStringKt.toOzonSpannableString(A02);
        List<EntryDTO.InputDTO> inputs = dto.getInputs();
        if (inputs == null || (inputDTO2 = (EntryDTO.InputDTO) C7714v.M(inputs)) == null) {
            inputDTO = null;
        } else {
            if (inputDTO2.getType() == EntryDTO.InputDTO.b.PHONE && (((value = inputDTO2.getValue()) == null || kotlin.text.h.K(value)) && inputDTO2.getCountrySelect() == null)) {
                inputDTO2 = EntryDTO.InputDTO.copy$default(inputDTO2, null, null, null, "+7", null, null, null, null, 247, null);
            }
            inputDTO = inputDTO2;
        }
        List<EntryDTO.EntryButtonDTO> hintButtons = dto.getHintButtons();
        if (hintButtons != null) {
            arrayList = new ArrayList();
            if (biometry != null) {
                arrayList.add(new b.InterfaceC2133b.C2135b(biometry.getButtonTitle(), biometry.getAction(), biometry.getChallenge()));
            }
            Iterator<EntryDTO.EntryButtonDTO> it2 = hintButtons.iterator();
            while (it2.hasNext()) {
                arrayList.add(C11088c.a(it2.next()));
            }
        }
        C7629C.k1(c7629c, new ru.ozon.id.nativeauth.data.models.b(B02, ozonSpannableString, inputDTO, dto.getSubmitButton(), arrayList, dVar, dto.getDisclaimer(), dto.getTermsOfUseText(), dto.getTranslationLexemes().getValidationLexemes(), dto.getFeatureFlags(), null, cVar));
        return Unit.f71690a;
    }
}
