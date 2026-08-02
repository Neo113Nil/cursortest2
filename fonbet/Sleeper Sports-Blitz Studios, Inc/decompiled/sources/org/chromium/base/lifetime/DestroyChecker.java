package org.chromium.base.lifetime;

/* loaded from: classes10.dex */
public class DestroyChecker implements Destroyable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDestroyed;

    public void checkNotDestroyed() {
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        checkNotDestroyed();
        this.mIsDestroyed = true;
    }

    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }
}
