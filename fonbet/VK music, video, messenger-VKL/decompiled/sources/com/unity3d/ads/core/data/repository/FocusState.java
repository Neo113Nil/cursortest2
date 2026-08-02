package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import java.lang.ref.WeakReference;
import xsna.epx;

/* compiled from: FocusRepository.kt */
/* loaded from: classes14.dex */
public interface FocusState {

    /* compiled from: FocusRepository.kt */
    public static final class Focused implements FocusState {
        private final WeakReference<Activity> activity;

        public Focused(WeakReference<Activity> weakReference) {
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = focused.activity;
            }
            return focused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        public final Focused copy(WeakReference<Activity> weakReference) {
            return new Focused(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Focused) && epx.f(this.activity, ((Focused) obj).activity);
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "Focused(activity=" + this.activity + ')';
        }
    }

    /* compiled from: FocusRepository.kt */
    public static final class Unfocused implements FocusState {
        private final WeakReference<Activity> activity;

        public Unfocused(WeakReference<Activity> weakReference) {
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = unfocused.activity;
            }
            return unfocused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        public final Unfocused copy(WeakReference<Activity> weakReference) {
            return new Unfocused(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unfocused) && epx.f(this.activity, ((Unfocused) obj).activity);
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "Unfocused(activity=" + this.activity + ')';
        }
    }

    WeakReference<Activity> getActivity();
}
