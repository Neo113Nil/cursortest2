package te;

import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.sports.insider.MyApp;
import com.sports.insider.ui.support.SupportChat;
import eg.m0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23928b;

    /* renamed from: c, reason: collision with root package name */
    public int f23929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SupportChat f23930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(SupportChat supportChat, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23928b = i5;
        this.f23930d = supportChat;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23928b) {
            case 0:
                return new z(this.f23930d, continuation, 0);
            case 1:
                return new z(this.f23930d, continuation, 1);
            default:
                return new z(this.f23930d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23928b) {
        }
        return ((z) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [gf.i, java.lang.Object] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Editable text;
        ec.g gVar;
        Editable text2;
        int i5 = this.f23928b;
        SupportChat supportChat = this.f23930d;
        String str = null;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f23929c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        sd.m mVar = (sd.m) supportChat.f7045c.getValue();
                        supportChat.I().getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sd.n.f23503k);
                        arrayList.add(sd.n.f23504l);
                        arrayList.add(sd.n.f23505m);
                        sd.d dVar = new sd.d(arrayList, 2);
                        this.f23929c = 1;
                        obj = mVar.c(dVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    sd.d dVar2 = (sd.d) obj;
                    if (dVar2 != null) {
                        if (dVar2.f23478b == sd.n.f23503k) {
                            md.m mVar2 = supportChat.I().f23900d;
                            mVar2.getClass();
                            eg.c0.t(MyApp.f6830c, mVar2.f20574c, null, new bd.b(2, null, 8), 2);
                        }
                        if (dVar2.f23478b == sd.n.f23504l) {
                            l0 I = supportChat.I();
                            ec.g gVar2 = (ec.g) supportChat.f22459a;
                            if (gVar2 != null && (text = gVar2.f8944g.getText()) != null) {
                                str = text.toString();
                            }
                            I.m(str);
                        }
                        if (dVar2.f23478b == sd.n.f23505m) {
                            supportChat.I().f23900d.l();
                        }
                    }
                } catch (Exception e7) {
                    zc.d.b(4, "SupportOnClickMenu", e7);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f23929c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    ec.g gVar3 = (ec.g) supportChat.f22459a;
                    if (gVar3 != null) {
                        EditText editText = gVar3.f8944g;
                        editText.clearFocus();
                        InputMethodManager inputMethodManager = supportChat.f7048f;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 2);
                        }
                        Editable text3 = editText.getText();
                        if (text3 != null) {
                            str = text3.toString();
                        }
                    }
                    l0 I2 = supportChat.I();
                    this.f23929c = 1;
                    String str2 = I2.f23903g;
                    String str3 = I2.f23902f;
                    lg.e eVar = m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new rc.f(I2, str, str2, str3, (Continuation) null), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Number) obj).longValue() > 0 && (gVar = (ec.g) supportChat.f22459a) != null && (text2 = gVar.f8944g.getText()) != null) {
                    text2.clear();
                }
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f23929c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar3 = lg.d.f20063c;
                    bd.b bVar = new bd.b(2, null, 23);
                    this.f23929c = 1;
                    if (eg.c0.A(dVar3, bVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ec.g gVar4 = (ec.g) supportChat.f22459a;
                if (gVar4 != null) {
                    gVar4.f8943f.smoothScrollToPosition(0);
                }
                return Unit.f19194a;
        }
    }
}
