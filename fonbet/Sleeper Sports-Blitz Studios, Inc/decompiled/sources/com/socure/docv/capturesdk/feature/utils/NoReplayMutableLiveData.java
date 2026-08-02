package com.socure.docv.capturesdk.feature.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoReplayLiveData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\tH\u0016¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/utils/NoReplayMutableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeForever", "NoReplayObserver", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoReplayMutableLiveData<T> extends MutableLiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner owner, Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observe(owner, new NoReplayObserver(getValue() != null, observer));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observeForever(new NoReplayObserver(getValue() != null, observer));
    }

    /* compiled from: NoReplayLiveData.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/utils/NoReplayMutableLiveData$NoReplayObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "hasInitialValue", "", "observer", "(ZLandroidx/lifecycle/Observer;)V", "hasEmittedAgain", "onChanged", "", "t", "(Ljava/lang/Object;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class NoReplayObserver<T> implements Observer<T> {
        private boolean hasEmittedAgain;
        private final boolean hasInitialValue;
        private final Observer<T> observer;

        public NoReplayObserver(boolean z, Observer<T> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.hasInitialValue = z;
            this.observer = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t) {
            if (!this.hasInitialValue || this.hasEmittedAgain) {
                this.observer.onChanged(t);
            }
            this.hasEmittedAgain = true;
        }
    }
}
