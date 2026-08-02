package com.bumptech.glide.request;

import xsna.f7g0;

/* loaded from: classes12.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public final boolean h() {
            return this.isComplete;
        }
    }

    boolean b();

    boolean c(f7g0 f7g0Var);

    void d(f7g0 f7g0Var);

    boolean g(f7g0 f7g0Var);

    RequestCoordinator getRoot();

    boolean h(f7g0 f7g0Var);

    void j(f7g0 f7g0Var);
}
