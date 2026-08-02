package re;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.d2;
import bet.prediction.response.Prediction;
import c4.v;
import c4.y;
import com.sports.insider.R;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ve.f0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends d2 implements l {

    /* renamed from: a, reason: collision with root package name */
    public f0 f22482a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f22483b;

    /* renamed from: c, reason: collision with root package name */
    public int f22484c;

    /* renamed from: d, reason: collision with root package name */
    public String f22485d;

    /* renamed from: e, reason: collision with root package name */
    public String f22486e;

    /* renamed from: f, reason: collision with root package name */
    public String f22487f;

    /* renamed from: g, reason: collision with root package name */
    public long f22488g;

    public static final void b(k kVar, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        kVar.f22482a.setBitmap(aVar != null ? aVar.f3564a : null);
    }

    @Override // re.l
    public final void a(Bundle payload) {
        int hashCode;
        Intrinsics.checkNotNullParameter(payload, "payload");
        String str = null;
        Integer num = null;
        for (String str2 : payload.keySet()) {
            if (Intrinsics.areEqual(str2, PredictionTable.statusColumn)) {
                str = payload.getString(PredictionTable.statusColumn);
            } else if (Intrinsics.areEqual(str2, PredictionTable.startTimeColumn)) {
                num = Integer.valueOf(payload.getInt(PredictionTable.startTimeColumn));
            }
        }
        if (str != null && ((hashCode = str.hashCode()) == -1867169789 ? str.equals("success") : hashCode == -934396624 ? str.equals(Prediction.RETURN) : hashCode == 3135262 && str.equals(Prediction.NOT_PASSED))) {
            int i5 = Intrinsics.areEqual(str, "success") ? 1 : Intrinsics.areEqual(str, Prediction.NOT_PASSED) ? 0 : -1;
            this.f22484c = i5;
            d(i5, this.f22485d, this.f22486e, this.f22487f);
            return;
        }
        if (num != null) {
            this.f22488g = num.intValue() * 1000;
        }
        long j = this.f22488g;
        if (j < 100000000) {
            this.f22484c = -3;
            d(-3, this.f22485d, this.f22486e, this.f22487f);
            return;
        }
        long currentTimeMillis = (j - System.currentTimeMillis()) / 1000;
        if (currentTimeMillis <= 0) {
            this.f22484c = -3;
            d(-3, this.f22485d, this.f22486e, this.f22487f);
            return;
        }
        this.f22484c = -2;
        this.f22482a.e(-2, this.f22485d, this.f22486e, this.f22487f, currentTimeMillis);
        if (this.f22483b == null) {
            j jVar = new j(this, currentTimeMillis * 1000, 1);
            this.f22483b = jVar;
            jVar.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, String str, int i5, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = R.drawable.bg_prediction;
        if (str != null && str.length() != 0) {
            boolean H = StringsKt.H(str);
            obj = str;
        }
        obj = Integer.valueOf(R.drawable.bg_prediction);
        q4.e eVar = new q4.e(context);
        eVar.f21940c = obj;
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.j.c(eVar, R.drawable.bg_prediction);
        eVar.f21948l = new eb.b(i11, 9);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new r7.a(1, this);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void d(int i5, String str, String str2, String str3) {
        CountDownTimer countDownTimer = this.f22483b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f22483b = null;
        this.f22482a.e(i5, str, str2, str3, 0L);
    }
}
