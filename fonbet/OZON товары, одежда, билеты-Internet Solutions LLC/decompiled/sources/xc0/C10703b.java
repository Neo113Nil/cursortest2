package xc0;

import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.api.ComposerAuthApi;
import ru.ozon.id.nativeauth.data.api.GetEntryRequestBody;
import ru.ozon.id.nativeauth.data.api.PageResponse;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import xe.M;

@e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getEntryCredentialsRequired$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {85, 87, 89}, m = "invokeSuspend")
/* renamed from: xc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10703b extends j implements Function2<M, d<? super EntryDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105358d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10702a f105359e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f105360f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10702a f105361g;

    /* renamed from: h, reason: collision with root package name */
    String f105362h;

    /* renamed from: i, reason: collision with root package name */
    GetEntryRequestBody f105363i;

    /* renamed from: j, reason: collision with root package name */
    String f105364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10703b(C10702a c10702a, String str, d dVar, C10702a c10702a2) {
        super(2, dVar);
        this.f105359e = c10702a;
        this.f105360f = str;
        this.f105361g = c10702a2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C10703b(this.f105359e, this.f105360f, dVar, this.f105361g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super EntryDTO> dVar) {
        return ((C10703b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (r11 != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        GetEntryRequestBody getEntryRequestBody;
        InterfaceC4008j interfaceC4008j;
        String str2;
        String str3;
        ComposerAuthApi n11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105358d;
        C10702a c10702a = this.f105361g;
        if (i11 == 0) {
            s.b(obj);
            String l11 = C10702a.l(this.f105359e, this.f105360f);
            vc0.c i12 = C10702a.i(c10702a);
            this.f105362h = l11;
            this.f105358d = 1;
            Object b11 = i12.b(this);
            if (b11 != aVar) {
                str = l11;
                obj = b11;
            }
            return aVar;
        }
        if (i11 == 1) {
            str = this.f105362h;
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return ((PageResponse) obj).getData();
            }
            str3 = this.f105364j;
            getEntryRequestBody = this.f105363i;
            str2 = this.f105362h;
            s.b(obj);
            if (!((Boolean) ((Function0) obj).invoke()).booleanValue()) {
                str3 = null;
            }
            n11 = c10702a.n();
            this.f105362h = null;
            this.f105363i = null;
            this.f105364j = null;
            this.f105358d = 3;
            obj = n11.getEntry(str2, str3, getEntryRequestBody, this);
        }
        getEntryRequestBody = new GetEntryRequestBody((String) obj, false, 2, null);
        interfaceC4008j = c10702a.f105322b;
        Hb0.c cVar = (Hb0.c) interfaceC4008j.getValue();
        f.h hVar = f.h.f10803a;
        this.f105362h = str;
        this.f105363i = getEntryRequestBody;
        this.f105364j = "IN";
        this.f105358d = 2;
        obj = cVar.a(hVar, this);
        if (obj != aVar) {
            str2 = str;
            str3 = "IN";
            if (!((Boolean) ((Function0) obj).invoke()).booleanValue()) {
            }
            n11 = c10702a.n();
            this.f105362h = null;
            this.f105363i = null;
            this.f105364j = null;
            this.f105358d = 3;
            obj = n11.getEntry(str2, str3, getEntryRequestBody, this);
        }
        return aVar;
    }
}
