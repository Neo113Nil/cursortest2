package cd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3805b;

    /* renamed from: c, reason: collision with root package name */
    public int f3806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(d dVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3805b = i5;
        this.f3807d = dVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3805b) {
            case 0:
                return new s(this.f3807d, continuation, 0);
            case 1:
                return new s(this.f3807d, continuation, 1);
            case 2:
                return new s(this.f3807d, continuation, 2);
            case 3:
                return new s(this.f3807d, continuation, 3);
            case 4:
                return new s(this.f3807d, continuation, 4);
            case 5:
                return new s(this.f3807d, continuation, 5);
            case 6:
                return new s(this.f3807d, continuation, 6);
            case 7:
                return new s(this.f3807d, continuation, 7);
            default:
                return new s(this.f3807d, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3805b) {
        }
        return ((s) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3805b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3806c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("funcName", "show_context_menu");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f3806c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    JSONObject put2 = new JSONObject().put("funcName", "OpenGallery");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f3806c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    JSONObject put3 = new JSONObject().put("funcName", "click_photo");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f3806c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    JSONObject put4 = new JSONObject().put("funcName", "click_send_msg");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f3806c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    JSONObject put5 = new JSONObject().put("funcName", "OpenFile");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f3806c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    JSONObject put6 = new JSONObject().put("funcName", "OpenPickerImage");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put6, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i15 = this.f3806c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    JSONObject put7 = new JSONObject().put("funcName", "previewImage");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put7, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i16 = this.f3806c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    JSONObject put8 = new JSONObject().put("funcName", "email_msg");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put8, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f3806c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    JSONObject put9 = new JSONObject().put("funcName", "send_purchase_info");
                    this.f3806c = 1;
                    if (this.f3807d.e("SUPPORT_FUNC_USES", put9, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
