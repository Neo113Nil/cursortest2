package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import com.sofascore.model.mvvm.model.StatusKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent;", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "Created", StatusKt.STATUS_DESCRIPTION_STARTED, "Resumed", "Paused", "Stopped", "SaveInstanceState", "Destroyed", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Created;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Destroyed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Paused;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Resumed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$SaveInstanceState;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Started;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Stopped;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LifecycleEvent {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Created;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/ref/WeakReference;Landroid/os/Bundle;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "getBundle", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Created implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        @Nullable
        private final Bundle bundle;

        public Created(@NotNull WeakReference<Activity> weakReference, @Nullable Bundle bundle) {
            weakReference.getClass();
            this.activity = weakReference;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = created.activity;
            }
            if ((i & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        @NotNull
        public final Created copy(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            activity.getClass();
            return new Created(activity, bundle);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Created)) {
                return false;
            }
            Created created = (Created) other;
            return Intrinsics.c(this.activity, created.activity) && Intrinsics.c(this.bundle, created.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @Nullable
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int hashCode = this.activity.hashCode() * 31;
            Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @NotNull
        public String toString() {
            return "Created(activity=" + this.activity + ", bundle=" + this.bundle + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Destroyed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Destroyed implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Destroyed(@NotNull WeakReference<Activity> weakReference) {
            weakReference.getClass();
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = destroyed.activity;
            }
            return destroyed.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @NotNull
        public final Destroyed copy(@NotNull WeakReference<Activity> activity) {
            activity.getClass();
            return new Destroyed(activity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Destroyed) && Intrinsics.c(this.activity, ((Destroyed) other).activity);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "Destroyed(activity=" + this.activity + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Paused;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Paused implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Paused(@NotNull WeakReference<Activity> weakReference) {
            weakReference.getClass();
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = paused.activity;
            }
            return paused.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @NotNull
        public final Paused copy(@NotNull WeakReference<Activity> activity) {
            activity.getClass();
            return new Paused(activity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Paused) && Intrinsics.c(this.activity, ((Paused) other).activity);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "Paused(activity=" + this.activity + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Resumed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resumed implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Resumed(@NotNull WeakReference<Activity> weakReference) {
            weakReference.getClass();
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = resumed.activity;
            }
            return resumed.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @NotNull
        public final Resumed copy(@NotNull WeakReference<Activity> activity) {
            activity.getClass();
            return new Resumed(activity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resumed) && Intrinsics.c(this.activity, ((Resumed) other).activity);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "Resumed(activity=" + this.activity + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$SaveInstanceState;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/ref/WeakReference;Landroid/os/Bundle;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "getBundle", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveInstanceState implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        @Nullable
        private final Bundle bundle;

        public SaveInstanceState(@NotNull WeakReference<Activity> weakReference, @Nullable Bundle bundle) {
            weakReference.getClass();
            this.activity = weakReference;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = saveInstanceState.activity;
            }
            if ((i & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        @NotNull
        public final SaveInstanceState copy(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            activity.getClass();
            return new SaveInstanceState(activity, bundle);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) other;
            return Intrinsics.c(this.activity, saveInstanceState.activity) && Intrinsics.c(this.bundle, saveInstanceState.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @Nullable
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int hashCode = this.activity.hashCode() * 31;
            Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @NotNull
        public String toString() {
            return "SaveInstanceState(activity=" + this.activity + ", bundle=" + this.bundle + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Started;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Started implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Started(@NotNull WeakReference<Activity> weakReference) {
            weakReference.getClass();
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = started.activity;
            }
            return started.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @NotNull
        public final Started copy(@NotNull WeakReference<Activity> activity) {
            activity.getClass();
            return new Started(activity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Started) && Intrinsics.c(this.activity, ((Started) other).activity);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "Started(activity=" + this.activity + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Stopped;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Stopped(@NotNull WeakReference<Activity> weakReference) {
            weakReference.getClass();
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = stopped.activity;
            }
            return stopped.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        @NotNull
        public final Stopped copy(@NotNull WeakReference<Activity> activity) {
            activity.getClass();
            return new Stopped(activity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stopped) && Intrinsics.c(this.activity, ((Stopped) other).activity);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "Stopped(activity=" + this.activity + ')';
        }
    }

    @NotNull
    WeakReference<Activity> getActivity();
}
