package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.location.LocationData;
import ai.verisoul.sdk.helpers.location.LocationHelper;
import ai.verisoul.sdk.logger.Logger;
import ai.verisoul.sdk.utils.SuspendCancellableCoroutineKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector;", "", "()V", "geolocationHelper", "Lai/verisoul/sdk/helpers/location/LocationHelper;", "getGeolocationHelper", "()Lai/verisoul/sdk/helpers/location/LocationHelper;", "geolocationHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectLocationData", "Lai/verisoul/sdk/helpers/location/LocationData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocationCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,37:1\n67#2:38\n*S KotlinDebug\n*F\n+ 1 LocationCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector\n*L\n15#1:38\n*E\n"})
/* loaded from: classes.dex */
public final class LocationCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LocationCollector.class, "geolocationHelper", "getGeolocationHelper()Lai/verisoul/sdk/helpers/location/LocationHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + LocationCollector.class.getSimpleName() + "]";

    /* renamed from: geolocationHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate geolocationHelper = new InjectDelegate(LocationHelper.class);

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationHelper getGeolocationHelper() {
        return (LocationHelper) this.geolocationHelper.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Object collectLocationData(@NotNull Continuation<? super LocationData> continuation) {
        final long currentTimeMillis = System.currentTimeMillis();
        return SuspendCancellableCoroutineKt.suspendWithTimeout$default(0L, new Function2<Function1<? super LocationData, ? extends Unit>, Function1<? super Throwable, ? extends Unit>, Unit>() { // from class: ai.verisoul.sdk.helpers.nativeDataCollection.LocationCollector$collectLocationData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super LocationData, ? extends Unit> function1, Function1<? super Throwable, ? extends Unit> function12) {
                invoke2((Function1<? super LocationData, Unit>) function1, (Function1<? super Throwable, Unit>) function12);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final Function1<? super LocationData, Unit> resume, @NotNull Function1<? super Throwable, Unit> resumeWithException) {
                LocationHelper geolocationHelper;
                Intrinsics.checkNotNullParameter(resume, "resume");
                Intrinsics.checkNotNullParameter(resumeWithException, "resumeWithException");
                try {
                    geolocationHelper = LocationCollector.this.getGeolocationHelper();
                    final LocationCollector locationCollector = LocationCollector.this;
                    final long j10 = currentTimeMillis;
                    geolocationHelper.collect(new Function1<LocationData, Unit>() { // from class: ai.verisoul.sdk.helpers.nativeDataCollection.LocationCollector$collectLocationData$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LocationData locationData) {
                            invoke2(locationData);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LocationData it) {
                            String str;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Logger logger = Logger.INSTANCE;
                            str = LocationCollector.this.logTag;
                            logger.metricLog(str, "location_duration", System.currentTimeMillis() - j10);
                            resume.invoke(it);
                        }
                    });
                } catch (Exception e10) {
                    resumeWithException.invoke(e10);
                }
            }
        }, continuation, 1, null);
    }
}
