package M6;

/* loaded from: classes2.dex */
public abstract class b implements e {
    @Override // M6.e
    public void onFailure(c cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.close();
        }
    }

    public abstract void onFailureImpl(c cVar);

    @Override // M6.e
    public void onNewResult(c cVar) {
        boolean d10 = cVar.d();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (d10) {
                cVar.close();
            }
        }
    }

    public abstract void onNewResultImpl(c cVar);

    @Override // M6.e
    public void onCancellation(c cVar) {
    }

    @Override // M6.e
    public void onProgressUpdate(c cVar) {
    }
}
