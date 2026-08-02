package defpackage;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TestSuiteActivity b;

    public /* synthetic */ k7j(TestSuiteActivity testSuiteActivity, int i) {
        this.a = i;
        this.b = testSuiteActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TestSuiteActivity testSuiteActivity = this.b;
        switch (i) {
            case 0:
                TestSuiteActivity.a(testSuiteActivity);
                break;
            default:
                TestSuiteActivity.b(testSuiteActivity);
                break;
        }
    }
}
