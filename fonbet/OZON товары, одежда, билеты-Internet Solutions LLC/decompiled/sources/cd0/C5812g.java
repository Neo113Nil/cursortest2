package cd0;

import Sc.s;
import android.os.Build;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeInfoDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeRequestDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeResponseDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSelectedKeyDto;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$handlePublicKeyAuth$1", f = "AuthViewModel.kt", l = {263, 275}, m = "invokeSuspend")
/* renamed from: cd0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5812g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56955d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5806a f56956e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ CrossAppSelectedKeyDto f56957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5812g(C5806a c5806a, CrossAppSelectedKeyDto crossAppSelectedKeyDto, kotlin.coroutines.d<? super C5812g> dVar) {
        super(2, dVar);
        this.f56956e = c5806a;
        this.f56957f = crossAppSelectedKeyDto;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5812g(this.f56956e, this.f56957f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5812g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        if (r1.x(r11, r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r11 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qc0.b bVar;
        qc0.c cVar;
        qc0.d dVar;
        Pc0.c B02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56955d;
        C5806a c5806a = this.f56956e;
        if (i11 == 0) {
            s.b(obj);
            bVar = c5806a.f56916g;
            for (AccountSignatureData accountSignatureData : bVar.c()) {
                String publicKey = accountSignatureData.getPublicKey();
                CrossAppSelectedKeyDto crossAppSelectedKeyDto = this.f56957f;
                if (Intrinsics.d(publicKey, crossAppSelectedKeyDto.getAuthPublicKey())) {
                    String appName = accountSignatureData.getAppName();
                    cVar = c5806a.f56914e;
                    String b11 = cVar.b(crossAppSelectedKeyDto.getAuthPublicKey(), crossAppSelectedKeyDto.getAuthChallenge());
                    if (b11 == null) {
                        c5806a.E0().v(new Throwable("Error during singing challenge from backend"));
                        return Unit.f71690a;
                    }
                    dVar = c5806a.f56915f;
                    String authAction = crossAppSelectedKeyDto.getAuthAction();
                    CrossAppChallengeInfoDto crossAppChallengeInfoDto = new CrossAppChallengeInfoDto(crossAppSelectedKeyDto.getAuthPublicKey(), appName, b11);
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    CrossAppChallengeRequestDto crossAppChallengeRequestDto = new CrossAppChallengeRequestDto(crossAppChallengeInfoDto, MODEL);
                    this.f56955d = 1;
                    obj = dVar.a(authAction, crossAppChallengeRequestDto, this);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
        s.b(obj);
        CrossAppChallengeResponseDto crossAppChallengeResponseDto = (CrossAppChallengeResponseDto) obj;
        if (!crossAppChallengeResponseDto.getStatus().getIsSuccess()) {
            throw new RuntimeException("Backend rejected signed challenge");
        }
        B02 = c5806a.B0();
        this.f56955d = 2;
    }
}
