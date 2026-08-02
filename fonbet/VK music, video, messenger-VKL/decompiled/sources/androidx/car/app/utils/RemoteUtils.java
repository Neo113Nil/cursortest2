package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.FailureResponse;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import xsna.ljn0;
import xsna.q580;
import xsna.rml;
import xsna.rro0;
import xsna.vc2;
import xsna.y5b;
import xsna.zr;

/* loaded from: classes11.dex */
public final class RemoteUtils {

    public static class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final Lifecycle mLifecycle;
        private final ljn0 mSurfaceCallback;

        public SurfaceCallbackStub(Lifecycle lifecycle, ljn0 ljn0Var) {
            this.mLifecycle = lifecycle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$7(float f, float f2) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onFling$5(float f, float f2) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScroll$4(float f, float f2) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceAvailable$0(Bundleable bundleable) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceDestroyed$3(Bundleable bundleable) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(final float f, final float f2) throws RemoteException {
            rro0.b(new vc2(this.mLifecycle, new a() { // from class: androidx.car.app.utils.b
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onClick$7;
                    lambda$onClick$7 = RemoteUtils.SurfaceCallbackStub.this.lambda$onClick$7(f, f2);
                    return lambda$onClick$7;
                }
            }, "onClick", 4));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(final float f, final float f2) {
            rro0.b(new vc2(this.mLifecycle, new a() { // from class: androidx.car.app.utils.f
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onFling$5;
                    lambda$onFling$5 = RemoteUtils.SurfaceCallbackStub.this.lambda$onFling$5(f, f2);
                    return lambda$onFling$5;
                }
            }, "onFling", 4));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(final float f, final float f2, final float f3) {
            rro0.b(new vc2(this.mLifecycle, new a() { // from class: androidx.car.app.utils.g
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onScale$6;
                    lambda$onScale$6 = RemoteUtils.SurfaceCallbackStub.this.lambda$onScale$6(f, f2, f3);
                    return lambda$onScale$6;
                }
            }, "onScale", 4));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(final float f, final float f2) {
            rro0.b(new vc2(this.mLifecycle, new a() { // from class: androidx.car.app.utils.e
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onScroll$4;
                    lambda$onScroll$4 = RemoteUtils.SurfaceCallbackStub.this.lambda$onScroll$4(f, f2);
                    return lambda$onScroll$4;
                }
            }, "onScroll", 4));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new a() { // from class: androidx.car.app.utils.h
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onStableAreaChanged$2;
                    lambda$onStableAreaChanged$2 = RemoteUtils.SurfaceCallbackStub.this.lambda$onStableAreaChanged$2(rect);
                    return lambda$onStableAreaChanged$2;
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a() { // from class: androidx.car.app.utils.d
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onSurfaceAvailable$0;
                    lambda$onSurfaceAvailable$0 = RemoteUtils.SurfaceCallbackStub.this.lambda$onSurfaceAvailable$0(bundleable);
                    return lambda$onSurfaceAvailable$0;
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a() { // from class: androidx.car.app.utils.a
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onSurfaceDestroyed$3;
                    lambda$onSurfaceDestroyed$3 = RemoteUtils.SurfaceCallbackStub.this.lambda$onSurfaceDestroyed$3(bundleable);
                    return lambda$onSurfaceDestroyed$3;
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new a() { // from class: androidx.car.app.utils.c
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onVisibleAreaChanged$1;
                    lambda$onVisibleAreaChanged$1 = RemoteUtils.SurfaceCallbackStub.this.lambda$onVisibleAreaChanged$1(rect);
                    return lambda$onVisibleAreaChanged$1;
                }
            });
        }
    }

    public interface a {
        @Nullable
        Object a() throws BundlerException;
    }

    public interface b<ReturnT> {
        @Nullable
        ReturnT call() throws RemoteException;
    }

    @NonNull
    public static IOnDoneCallback a() {
        return new IOnDoneCallback.Stub(null) { // from class: androidx.car.app.utils.RemoteUtils.1
            final /* synthetic */ q580 val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(Bundleable bundleable) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(Bundleable bundleable) {
                throw null;
            }
        };
    }

    public static void b(@NonNull IOnDoneCallback iOnDoneCallback, @NonNull String str, @NonNull a aVar) {
        rro0.b(new rml(iOnDoneCallback, str, aVar, 2));
    }

    public static void c(@Nullable Lifecycle lifecycle, @NonNull IOnDoneCallback iOnDoneCallback, @NonNull String str, @NonNull a aVar) {
        rro0.b(new y5b(lifecycle, iOnDoneCallback, str, aVar, 1));
    }

    public static void d(@NonNull String str, @NonNull b<?> bVar) {
        try {
            try {
                bVar.call();
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException(zr.a("Remote ", str, " call failed"), e2);
            }
        } catch (RemoteException e3) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e3);
        }
    }

    public static void e(@NonNull final IOnDoneCallback iOnDoneCallback, @NonNull final Exception exc, @NonNull final String str) {
        d(str.concat(" onFailure"), new b() { // from class: xsna.dwf0
            @Override // androidx.car.app.utils.RemoteUtils.b
            public final Object call() {
                try {
                    IOnDoneCallback.this.onFailure(new Bundleable(new FailureResponse(exc)));
                    return null;
                } catch (BundlerException e) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                    return null;
                }
            }
        });
    }

    public static void f(@NonNull final IOnDoneCallback iOnDoneCallback, @Nullable final Object obj, @NonNull final String str) {
        d(str.concat(" onSuccess"), new b() { // from class: xsna.cwf0
            @Override // androidx.car.app.utils.RemoteUtils.b
            public final Object call() {
                Bundleable bundleable;
                IOnDoneCallback iOnDoneCallback2 = IOnDoneCallback.this;
                Object obj2 = obj;
                if (obj2 == null) {
                    bundleable = null;
                } else {
                    try {
                        bundleable = new Bundleable(obj2);
                    } catch (BundlerException e) {
                        RemoteUtils.e(iOnDoneCallback2, e, str);
                        return null;
                    }
                }
                iOnDoneCallback2.onSuccess(bundleable);
                return null;
            }
        });
    }
}
