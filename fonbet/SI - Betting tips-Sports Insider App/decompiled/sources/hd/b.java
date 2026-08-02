package hd;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import eg.z;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, String str, Continuation continuation) {
        super(2, continuation);
        this.f10507b = i5;
        this.f10508c = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f10507b) {
            case 0:
                return new b(0, this.f10508c, continuation);
            case 1:
                return new b(1, this.f10508c, continuation);
            default:
                return new b(2, this.f10508c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f10507b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i5 = this.f10507b;
        String defValue = this.f10508c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                if (defValue.length() != 0) {
                    Intrinsics.checkNotNullParameter(defValue, "source");
                    try {
                        byte[] decode = Base64.decode(defValue, 0);
                        Intrinsics.checkNotNull(decode);
                        Charset forName = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                        str = new String(decode, forName);
                    } catch (UnsupportedEncodingException unused) {
                        str = null;
                    }
                    defValue = String.valueOf(str);
                }
                Intrinsics.checkNotNullParameter(defValue, "keyValue");
                fa.a aVar2 = (fa.a) y3.m(fa.a.class, null, 6);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter("CPEnableSupportParams", "key");
                Intrinsics.checkNotNullParameter(defValue, "defValue");
                SharedPreferences sharedPref = aVar2.f9542b;
                Intrinsics.checkNotNullParameter("CPEnableSupportParams", "key");
                Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
                SharedPreferences.Editor edit = sharedPref.edit();
                edit.putString("CPEnableSupportParams", defValue);
                edit.apply();
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return defValue.length() == 0 ? new GamesInfoData(null, null, null) : (GamesInfoData) new com.google.gson.j().b(GamesInfoData.class, defValue);
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    System.out.println((Object) defValue);
                } catch (Exception unused2) {
                }
                return Unit.f19194a;
        }
    }
}
