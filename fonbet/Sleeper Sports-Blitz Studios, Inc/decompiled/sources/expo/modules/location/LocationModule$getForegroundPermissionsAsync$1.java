package expo.modules.location;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LocationModule.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.location.LocationModule", f = "LocationModule.kt", i = {0, 1}, l = {315, TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "getForegroundPermissionsAsync", n = {"it", "locationPermission"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
final class LocationModule$getForegroundPermissionsAsync$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationModule$getForegroundPermissionsAsync$1(LocationModule locationModule, Continuation<? super LocationModule$getForegroundPermissionsAsync$1> continuation) {
        super(continuation);
        this.this$0 = locationModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object foregroundPermissionsAsync;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        foregroundPermissionsAsync = this.this$0.getForegroundPermissionsAsync(this);
        return foregroundPermissionsAsync;
    }
}
