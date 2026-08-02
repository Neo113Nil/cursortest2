package b6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnCompleteListener, w7.d, w7.c, w7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3051b;

    public /* synthetic */ h(CountDownLatch countDownLatch) {
        this.f3050a = 0;
        this.f3051b = countDownLatch;
    }

    @Override // w7.b
    public void b() {
        switch (this.f3050a) {
            case 1:
                this.f3051b.countDown();
                break;
            default:
                this.f3051b.countDown();
                break;
        }
    }

    @Override // w7.c
    public void c(Exception exc) {
        switch (this.f3050a) {
            case 1:
                this.f3051b.countDown();
                break;
            default:
                this.f3051b.countDown();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.f3051b.countDown();
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        switch (this.f3050a) {
            case 1:
                this.f3051b.countDown();
                break;
            default:
                this.f3051b.countDown();
                break;
        }
    }

    public h(int i5) {
        this.f3050a = i5;
        switch (i5) {
            case 2:
                this.f3051b = new CountDownLatch(1);
                break;
            default:
                this.f3051b = new CountDownLatch(1);
                break;
        }
    }
}
