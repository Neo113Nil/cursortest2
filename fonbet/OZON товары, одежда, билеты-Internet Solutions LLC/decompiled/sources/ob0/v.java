package ob0;

import Sc.InterfaceC4008j;
import We.A;
import We.L;
import We.M;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.antibot.AntibotDTO;
import sf.InterfaceC9683i;
import wb0.C10469a;
import wb0.C10471c;
import wb0.InterfaceC10470b;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f78010a;

    static final class a extends AbstractC7737t implements Function0<JsonAdapter<AntibotDTO>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4008j<Moshi> f78011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4008j<Moshi> interfaceC4008j) {
            super(0);
            this.f78011b = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<AntibotDTO> invoke() {
            return this.f78011b.getValue().c(AntibotDTO.class);
        }
    }

    public v(@NotNull InterfaceC4008j<Moshi> moshiDecoder) {
        Intrinsics.checkNotNullParameter(moshiDecoder, "moshiDecoder");
        this.f78010a = Sc.k.b(new a(moshiDecoder));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC10470b a(@NotNull L response) {
        AntibotDTO antibotDTO;
        M c11;
        InterfaceC9683i source;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.m() == 403) {
            try {
                c11 = response.c();
            } catch (Exception unused) {
            }
            if (c11 != null && (source = c11.source()) != null && source.isOpen() && (antibotDTO = (AntibotDTO) ((JsonAdapter) this.f78010a.getValue()).fromJson(source)) != null) {
                String supportURL = antibotDTO.getSupportURL();
                if (supportURL != null) {
                    We.A.f33515l.getClass();
                    We.A e11 = A.b.e(supportURL);
                    if (e11 != null) {
                        A.a j11 = e11.j();
                        j11.y("back_url", "ozon://back");
                        antibotDTO = AntibotDTO.copy$default(antibotDTO, null, null, null, null, null, null, j11.e().toString(), null, null, 447, null);
                    }
                }
                if (antibotDTO != null) {
                    String incidentId = antibotDTO.getIncidentId();
                    if (incidentId != null && incidentId.length() != 0) {
                        if (w.a(incidentId)) {
                            return new wb0.d(response, incidentId);
                        }
                        if (incidentId.length() > 0) {
                            return new C10469a(incidentId, antibotDTO.getSupportURL(), antibotDTO.getChallengeURL(), antibotDTO.getErrorText(), antibotDTO.getHideCloseButton(), antibotDTO.getCaptchaURL(), antibotDTO.getCaptchaTimeoutMs(), antibotDTO.getMf(), antibotDTO.getMfToken(), response);
                        }
                        return null;
                    }
                    return new C10471c(response);
                }
            }
            antibotDTO = null;
            if (antibotDTO != null) {
            }
        }
        return null;
    }
}
