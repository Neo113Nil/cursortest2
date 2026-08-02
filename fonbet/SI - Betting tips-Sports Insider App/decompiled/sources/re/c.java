package re;

import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.d2;
import bet.prediction.response.Prediction;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import kotlin.jvm.internal.Intrinsics;
import ve.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends d2 implements l {

    /* renamed from: a, reason: collision with root package name */
    public q f22463a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f22464b;

    /* renamed from: c, reason: collision with root package name */
    public int f22465c;

    /* renamed from: d, reason: collision with root package name */
    public String f22466d;

    /* renamed from: e, reason: collision with root package name */
    public String f22467e;

    /* renamed from: f, reason: collision with root package name */
    public String f22468f;

    /* renamed from: g, reason: collision with root package name */
    public long f22469g;

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
            this.f22465c = i5;
            b(i5, this.f22466d, this.f22467e, this.f22468f);
            return;
        }
        if (num != null) {
            this.f22469g = num.intValue() * 1000;
        }
        long j = this.f22469g;
        if (j < 100000000) {
            this.f22465c = -3;
            b(-3, this.f22466d, this.f22467e, this.f22468f);
            return;
        }
        long currentTimeMillis = (j - System.currentTimeMillis()) / 1000;
        if (currentTimeMillis <= 0) {
            this.f22465c = -3;
            b(-3, this.f22466d, this.f22467e, this.f22468f);
            return;
        }
        this.f22465c = -2;
        this.f22463a.e(-2, this.f22466d, this.f22467e, this.f22468f, currentTimeMillis);
        if (this.f22464b == null) {
            b bVar = new b(this, currentTimeMillis * 1000, 1);
            this.f22464b = bVar;
            bVar.start();
        }
    }

    public final void b(int i5, String str, String str2, String str3) {
        CountDownTimer countDownTimer = this.f22464b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f22464b = null;
        this.f22463a.e(i5, str, str2, str3, 0L);
    }
}
