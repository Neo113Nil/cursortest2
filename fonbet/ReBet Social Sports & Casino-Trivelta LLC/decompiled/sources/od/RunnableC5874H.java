package od;

/* renamed from: od.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC5874H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.w f59629a;

    public /* synthetic */ RunnableC5874H(androidx.room.w wVar) {
        this.f59629a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59629a.clearAllTables();
    }
}
