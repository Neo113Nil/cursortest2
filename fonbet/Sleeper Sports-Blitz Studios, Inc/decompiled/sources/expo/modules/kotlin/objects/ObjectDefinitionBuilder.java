package expo.modules.kotlin.objects;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.EnumExtensionsKt;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.FunctionBuilder;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.objects.EventObservingDefinition;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.Enumerable;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;

/* compiled from: ObjectDefinitionBuilder.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u00106\u001a\u000207J$\u00108\u001a\u0002092\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000bH\u0007J=\u00108\u001a\u0002092.\u0010.\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010;0:\"\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010;H\u0007¢\u0006\u0002\u0010<J\u000e\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\rJ+\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\r2\u0010\b\u0004\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b@J,\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u000e\b\u0004\u0010?\u001a\b\u0012\u0004\u0012\u0002HA0\u000bH\u0086\bø\u0001\u0000JI\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u00012\u0006\u0010>\u001a\u00020\r2#\b\u0004\u0010?\u001a\u001d\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0004\u0012\u0002HA0CH\u0086\bø\u0001\u0000Jf\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u00012\u0006\u0010>\u001a\u00020\r28\b\u0004\u0010?\u001a2\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002HA0GH\u0086\bø\u0001\u0000J\u0083\u0001\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u00012\u0006\u0010>\u001a\u00020\r2M\b\u0004\u0010?\u001aG\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002HA0JH\u0086\bø\u0001\u0000J \u0001\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u00012\u0006\u0010>\u001a\u00020\r2b\b\u0004\u0010?\u001a\\\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HA0MH\u0086\bø\u0001\u0000J½\u0001\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u00012\u0006\u0010>\u001a\u00020\r2w\b\u0004\u0010?\u001aq\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HA0PH\u0086\bø\u0001\u0000JÜ\u0001\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u008d\u0001\b\u0004\u0010?\u001a\u0086\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0004\u0012\u0002HA0SH\u0086\bø\u0001\u0000Jù\u0001\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u0001\"\u0006\b\u0007\u0010U\u0018\u00012\u0006\u0010>\u001a\u00020\r2¢\u0001\b\u0004\u0010?\u001a\u009b\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u0011HU¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0004\u0012\u0002HA0VH\u0086\bø\u0001\u0000J\u0096\u0002\u0010=\u001a\u00020\u0017\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u0001\"\u0006\b\u0007\u0010U\u0018\u0001\"\u0006\b\b\u0010X\u0018\u00012\u0006\u0010>\u001a\u00020\r2·\u0001\b\u0004\u0010?\u001a°\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u0011HU¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0013\u0012\u0011HX¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002HA0YH\u0086\bø\u0001\u0000J+\u0010[\u001a\u00020#2\u0006\u0010>\u001a\u00020\r2\u0010\b\u0004\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\\J,\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u000e\b\u0004\u0010?\u001a\b\u0012\u0004\u0012\u0002HA0\u000bH\u0086\bø\u0001\u0000JI\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u00012\u0006\u0010>\u001a\u00020\r2#\b\u0004\u0010?\u001a\u001d\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0004\u0012\u0002HA0CH\u0086\bø\u0001\u0000Jf\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u00012\u0006\u0010>\u001a\u00020\r28\b\u0004\u0010?\u001a2\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002HA0GH\u0086\bø\u0001\u0000Jc\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u00012\u0006\u0010>\u001a\u00020\r28\b\u0004\u0010?\u001a2\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002HA0GH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J\u0083\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u00012\u0006\u0010>\u001a\u00020\r2M\b\u0004\u0010?\u001aG\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002HA0JH\u0086\bø\u0001\u0000J\u0080\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u00012\u0006\u0010>\u001a\u00020\r2M\b\u0004\u0010?\u001aG\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002HA0JH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J \u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u00012\u0006\u0010>\u001a\u00020\r2b\b\u0004\u0010?\u001a\\\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HA0MH\u0086\bø\u0001\u0000J\u009d\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u00012\u0006\u0010>\u001a\u00020\r2b\b\u0004\u0010?\u001a\\\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HA0MH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J½\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u00012\u0006\u0010>\u001a\u00020\r2w\b\u0004\u0010?\u001aq\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HA0PH\u0086\bø\u0001\u0000Jº\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u00012\u0006\u0010>\u001a\u00020\r2w\b\u0004\u0010?\u001aq\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HA0PH\u0087\bø\u0001\u0000¢\u0006\u0002\b^JÜ\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u008d\u0001\b\u0004\u0010?\u001a\u0086\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0004\u0012\u0002HA0SH\u0086\bø\u0001\u0000JÙ\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u008d\u0001\b\u0004\u0010?\u001a\u0086\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0004\u0012\u0002HA0SH\u0087\bø\u0001\u0000¢\u0006\u0002\b^Jù\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u0001\"\u0006\b\u0007\u0010U\u0018\u00012\u0006\u0010>\u001a\u00020\r2¢\u0001\b\u0004\u0010?\u001a\u009b\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u0011HU¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0004\u0012\u0002HA0VH\u0086\bø\u0001\u0000Jö\u0001\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u00012\u0006\u0010>\u001a\u00020\r2¢\u0001\b\u0004\u0010?\u001a\u009b\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0004\u0012\u0002HA0VH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J\u0096\u0002\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u0001\"\u0006\b\u0007\u0010U\u0018\u0001\"\u0006\b\b\u0010X\u0018\u00012\u0006\u0010>\u001a\u00020\r2·\u0001\b\u0004\u0010?\u001a°\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u0011HU¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0013\u0012\u0011HX¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002HA0YH\u0086\bø\u0001\u0000J\u0093\u0002\u0010[\u001a\u00020#\"\u0006\b\u0000\u0010A\u0018\u0001\"\u0006\b\u0001\u0010B\u0018\u0001\"\u0006\b\u0002\u0010F\u0018\u0001\"\u0006\b\u0003\u0010I\u0018\u0001\"\u0006\b\u0004\u0010L\u0018\u0001\"\u0006\b\u0005\u0010O\u0018\u0001\"\u0006\b\u0006\u0010R\u0018\u0001\"\u0006\b\u0007\u0010U\u0018\u00012\u0006\u0010>\u001a\u00020\r2·\u0001\b\u0004\u0010?\u001a°\u0001\u0012\u0013\u0012\u0011HB¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(E\u0012\u0013\u0012\u0011HF¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(H\u0012\u0013\u0012\u0011HI¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(K\u0012\u0013\u0012\u0011HL¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(N\u0012\u0013\u0012\u0011HO¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Q\u0012\u0013\u0012\u0011HR¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(T\u0012\u0013\u0012\u0011HU¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110]¢\u0006\f\bD\u0012\b\b>\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002HA0YH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J\u000e\u0010[\u001a\u00020(2\u0006\u0010>\u001a\u00020\rJ\u001f\u0010_\u001a\u0002092\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0:\"\u00020\r¢\u0006\u0002\u0010aJ\u001d\u0010_\u001a\u0002092\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\r0:H\u0007¢\u0006\u0004\bb\u0010aJ\u001f\u0010_\u001a\u000209\"\u0014\b\u0000\u0010c\u0018\u0001*\u00020d*\b\u0012\u0004\u0012\u0002Hc0eH\u0086\bJ\u001c\u0010f\u001a\u0002092\u0006\u0010g\u001a\u00020\r2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000bJ5\u0010f\u001a\u000209\"\u0012\b\u0000\u0010c*\u00020d*\b\u0012\u0004\u0012\u0002Hc0e2\u0006\u0010h\u001a\u0002Hc2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000b¢\u0006\u0002\u0010iJ\u0014\u0010f\u001a\u0002092\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000bJ\u001c\u0010j\u001a\u0002092\u0006\u0010g\u001a\u00020\r2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000bJ5\u0010j\u001a\u000209\"\u0012\b\u0000\u0010c*\u00020d*\b\u0012\u0004\u0012\u0002Hc0e2\u0006\u0010h\u001a\u0002Hc2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000b¢\u0006\u0002\u0010iJ\u0014\u0010j\u001a\u0002092\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u000bJ\u0010\u0010k\u001a\u00020*2\u0006\u0010>\u001a\u00020\rH\u0016J,\u0010k\u001a\u00020*\"\u0006\b\u0000\u0010c\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u000e\b\u0004\u0010?\u001a\b\u0012\u0004\u0012\u0002Hc0\u000bH\u0086\bø\u0001\u0000J\u0010\u0010l\u001a\u00020/2\u0006\u0010>\u001a\u00020\rH\u0016J,\u0010l\u001a\u00020/\"\u0006\b\u0000\u0010c\u0018\u00012\u0006\u0010>\u001a\u00020\r2\u000e\b\u0004\u0010?\u001a\b\u0012\u0004\u0012\u0002Hc0\u000bH\u0086\bø\u0001\u0000R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR0\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020#0\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR0\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0007\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006m"}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "", "converters", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "getConverters$annotations", "()V", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "legacyConstantsProvider", "Lkotlin/Function0;", "", "", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition$annotations", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "setEventsDefinition", "(Lexpo/modules/kotlin/events/EventsDefinition;)V", "syncFunctions", "", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getSyncFunctions$annotations", "getSyncFunctions", "()Ljava/util/Map;", "setSyncFunctions", "(Ljava/util/Map;)V", "syncFunctionBuilder", "Lexpo/modules/kotlin/functions/FunctionBuilder;", "getSyncFunctionBuilder$annotations", "getSyncFunctionBuilder", "setSyncFunctionBuilder", "asyncFunctions", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "getAsyncFunctions$annotations", "getAsyncFunctions", "setAsyncFunctions", "asyncFunctionBuilders", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "properties", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "getProperties$annotations", "getProperties", "setProperties", "constants", "Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "getConstants$annotations", "getConstants", "setConstants", "eventObservers", "", "Lexpo/modules/kotlin/objects/EventObservingDefinition;", "buildObject", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Constants", "", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "Function", "name", "body", "FunctionWithoutArgs", "R", "P0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p0", "P1", "Lkotlin/Function2;", "p1", "P2", "Lkotlin/Function3;", "p2", "P3", "Lkotlin/Function4;", "p3", "P4", "Lkotlin/Function5;", "p4", "P5", "Lkotlin/Function6;", "p5", "P6", "Lkotlin/Function7;", "p6", "P7", "Lkotlin/Function8;", "p7", "AsyncFunction", "AsyncFunctionWithoutArgs", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "Events", "events", "([Ljava/lang/String;)V", "EventsWithArray", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/kotlin/types/Enumerable;", "", "OnStartObserving", "eventName", "enum", "(Ljava/lang/Enum;Lkotlin/jvm/functions/Function0;)V", "OnStopObserving", "Property", "Constant", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ObjectDefinitionBuilder {
    private Map<String, AsyncFunctionBuilder> asyncFunctionBuilders;
    private Map<String, AsyncFunctionComponent> asyncFunctions;
    private Map<String, ConstantComponentBuilder> constants;
    private final TypeConverterProvider converters;
    private final List<EventObservingDefinition> eventObservers;
    private EventsDefinition eventsDefinition;
    private Function0<? extends Map<String, ? extends Object>> legacyConstantsProvider;
    private Map<String, PropertyComponentBuilder> properties;
    private Map<String, FunctionBuilder> syncFunctionBuilder;
    private Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getConstants$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getEventsDefinition$annotations() {
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public static /* synthetic */ void getSyncFunctionBuilder$annotations() {
    }

    public static /* synthetic */ void getSyncFunctions$annotations() {
    }

    public ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider) {
        this.converters = typeConverterProvider;
        this.legacyConstantsProvider = new Function0() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map emptyMap;
                emptyMap = MapsKt.emptyMap();
                return emptyMap;
            }
        };
        this.syncFunctions = new LinkedHashMap();
        this.syncFunctionBuilder = new LinkedHashMap();
        this.asyncFunctions = new LinkedHashMap();
        this.asyncFunctionBuilders = new LinkedHashMap();
        this.properties = new LinkedHashMap();
        this.constants = new LinkedHashMap();
        this.eventObservers = new ArrayList();
    }

    public /* synthetic */ ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeConverterProvider);
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final void setEventsDefinition(EventsDefinition eventsDefinition) {
        this.eventsDefinition = eventsDefinition;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final void setSyncFunctions(Map<String, SyncFunctionComponent> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.syncFunctions = map;
    }

    public final Map<String, FunctionBuilder> getSyncFunctionBuilder() {
        return this.syncFunctionBuilder;
    }

    public final void setSyncFunctionBuilder(Map<String, FunctionBuilder> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.syncFunctionBuilder = map;
    }

    public final Map<String, AsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final void setAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.asyncFunctions = map;
    }

    public final Map<String, PropertyComponentBuilder> getProperties() {
        return this.properties;
    }

    public final void setProperties(Map<String, PropertyComponentBuilder> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.properties = map;
    }

    public final Map<String, ConstantComponentBuilder> getConstants() {
        return this.constants;
    }

    public final void setConstants(Map<String, ConstantComponentBuilder> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.constants = map;
    }

    public final ObjectDefinitionData buildObject() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        for (final EventObservingDefinition.Type type : EventObservingDefinition.Type.getEntries()) {
            if (!this.asyncFunctions.containsKey(type.getValue())) {
                String value = type.getValue();
                if (Intrinsics.areEqual(String.class, Promise.class)) {
                    asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(value, new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object[] objArr, Promise promise) {
                            List list;
                            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                            Intrinsics.checkNotNullParameter(promise, "promise");
                            String str = (String) promise;
                            list = ObjectDefinitionBuilder.this.eventObservers;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                            invoke2(objArr, promise);
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    TypeConverterProvider converters = getConverters();
                    AnyType[] anyTypeArr = new AnyType[1];
                    AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                    if (anyType == null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$2
                                @Override // kotlin.jvm.functions.Function0
                                public final KType invoke() {
                                    return Reflection.typeOf(String.class);
                                }
                            }));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                            Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl);
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                            m13470constructorimpl = null;
                        }
                        TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                            typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                        }
                        anyType = new AnyType(typeDescriptor, converters);
                    }
                    anyTypeArr[0] = anyType;
                    Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Unit invoke(Object[] objArr) {
                            List list;
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            String str = (String) objArr[0];
                            list = ObjectDefinitionBuilder.this.eventObservers;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                                if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                    if (Intrinsics.areEqual(Unit.class, String.class)) {
                                        untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(value, anyTypeArr, function1);
                                    } else {
                                        untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(value, anyTypeArr, function1);
                                    }
                                } else {
                                    untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(value, anyTypeArr, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(value, anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(value, anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(value, anyTypeArr, function1);
                    }
                    asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
                }
                getAsyncFunctions().put(value, asyncFunctionWithPromiseComponent);
            }
        }
        Map<String, AsyncFunctionComponent> map = this.asyncFunctions;
        Map<String, AsyncFunctionBuilder> map2 = this.asyncFunctionBuilders;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AsyncFunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mutableMap = MapsKt.toMutableMap(MapsKt.plus(map, linkedHashMap));
        Function0<? extends Map<String, ? extends Object>> function0 = this.legacyConstantsProvider;
        Map<String, SyncFunctionComponent> map3 = this.syncFunctions;
        Map<String, FunctionBuilder> map4 = this.syncFunctionBuilder;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map4.size()));
        Iterator<T> it2 = map4.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), ((FunctionBuilder) entry2.getValue()).build$expo_modules_core_release());
        }
        Map plus = MapsKt.plus(map3, linkedHashMap2);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        Map<String, PropertyComponentBuilder> map5 = this.properties;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(map5.size()));
        Iterator<T> it3 = map5.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            linkedHashMap3.put(entry3.getKey(), ((PropertyComponentBuilder) entry3.getValue()).build());
        }
        Map<String, ConstantComponentBuilder> map6 = this.constants;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(map6.size()));
        Iterator<T> it4 = map6.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it4.next();
            linkedHashMap4.put(entry4.getKey(), ((ConstantComponentBuilder) entry4.getValue()).build());
        }
        return new ObjectDefinitionData(function0, plus, mutableMap, eventsDefinition, linkedHashMap3, linkedHashMap4);
    }

    @Deprecated(message = "Use `Constant` or `Property` instead")
    public final void Constants(Function0<? extends Map<String, ? extends Object>> legacyConstantsProvider) {
        Intrinsics.checkNotNullParameter(legacyConstantsProvider, "legacyConstantsProvider");
        this.legacyConstantsProvider = legacyConstantsProvider;
    }

    @Deprecated(message = "Use `Constant` or `Property` instead")
    public final void Constants(final Pair<String, ? extends Object>... constants) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.legacyConstantsProvider = new Function0() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map map;
                map = MapsKt.toMap(constants);
                return map;
            }
        };
    }

    public final FunctionBuilder Function(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        FunctionBuilder functionBuilder = new FunctionBuilder(name);
        this.syncFunctionBuilder.put(name, functionBuilder);
        return functionBuilder;
    }

    public final SyncFunctionComponent FunctionWithoutArgs(String name, final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R> SyncFunctionComponent Function(String name, final Function0<? extends R> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Function(String name, final Function1<? super P0, ? extends R> body) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        AnyType[] anyTypeArr = new AnyType[1];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Function(String name, final Function2<? super P0, ? super P1, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        RawTypeDescriptor rawTypeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType2 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType2 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
            } catch (Throwable th) {
                th = th;
                kType = null;
            }
            try {
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl == null) {
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                }
                anyType2 = new AnyType(typeDescriptor, converters);
                anyTypeArr[0] = anyType2;
                AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "P1");
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                Intrinsics.reifiedOperationMarker(3, "P1");
                anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                if (anyType == null) {
                }
                anyTypeArr[1] = anyType;
                ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                Intrinsics.reifiedOperationMarker(4, "R");
                returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                if (returnType == null) {
                }
                SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return body.invoke(objArr[0], objArr[1]);
                    }
                });
                getSyncFunctions().put(name, syncFunctionComponent);
                return syncFunctionComponent;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                z = false;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                z = false;
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType2;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Function(String name, final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        AnyType[] anyTypeArr = new AnyType[3];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType3 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType3 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                kType = null;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    z = false;
                    try {
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$4
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                Intrinsics.reifiedOperationMarker(6, "P0");
                                return null;
                            }
                        }));
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                        }
                        anyType3 = new AnyType(typeDescriptor, converters);
                        anyTypeArr[0] = anyType3;
                        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P1");
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P1");
                        anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                        if (anyType == null) {
                        }
                        anyTypeArr[1] = anyType;
                        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P2");
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P2");
                        anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                        if (anyType2 == null) {
                        }
                        anyTypeArr[2] = anyType2;
                        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                        Intrinsics.reifiedOperationMarker(4, "R");
                        returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                        if (returnType == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                return body.invoke(objArr[0], objArr[1], objArr[2]);
                            }
                        });
                        getSyncFunctions().put(name, syncFunctionComponent);
                        return syncFunctionComponent;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                kType = null;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType3 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType3;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$6
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = kType;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Function(String name, final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        AnyType[] anyTypeArr = new AnyType[4];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType4 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType4 != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                z = false;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType4 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType4;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, Boolean.valueOf(z)));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
                        }
                    });
                    getSyncFunctions().put(name, syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType4;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$8
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$9
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, Boolean.valueOf(z)));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Function(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        AnyType[] anyTypeArr = new AnyType[5];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$11
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$12
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$13
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$14
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$15
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Function(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        AnyType[] anyTypeArr = new AnyType[6];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$16
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) (Result.m13476isFailureimpl(obj) ? null : obj);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$17
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$18
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$19
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$20
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$21
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType6;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Function(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        Object obj;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj2;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        AnyType anyType4;
        Object m13470constructorimpl5;
        AnyType anyType5;
        Object m13470constructorimpl6;
        AnyType anyType6;
        Object m13470constructorimpl7;
        char c;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        AnyType[] anyTypeArr = new AnyType[7];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType7 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType7 != null) {
            obj = "io.github.lukmccall.pika.typeInfo";
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                obj = "io.github.lukmccall.pika.typeInfo";
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$22
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl == null) {
                    }
                    typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
                    if (typeDescriptor == null) {
                    }
                    anyType7 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType7;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P5");
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P5");
                    anyType5 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
                    if (anyType5 == null) {
                    }
                    anyTypeArr[5] = anyType5;
                    AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P6");
                    KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P6");
                    anyType6 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
                    if (anyType6 == null) {
                    }
                    anyTypeArr[c] = anyType6;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
                        }
                    });
                    getSyncFunctions().put(name, syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = "io.github.lukmccall.pika.typeInfo";
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj2 = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj2 = m13470constructorimpl;
            }
            typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType7;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$23
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$24
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$25
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$26
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType4;
        AnyTypeCache anyTypeCache62 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass62 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        anyType5 = anyTypeCache62.getTypesMap().get(new Pair(orCreateKotlinClass62, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$27
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType5;
        AnyTypeCache anyTypeCache72 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass72 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        anyType6 = anyTypeCache72.getTypesMap().get(new Pair(orCreateKotlinClass72, false));
        if (anyType6 == null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$28
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor7 != null) {
                c = 6;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor7, converters);
        }
        anyTypeArr[c] = anyType6;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Function(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Object m13470constructorimpl7;
        char c;
        Object m13470constructorimpl8;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        Intrinsics.reifiedOperationMarker(4, "P7");
        AnyType[] anyTypeArr = new AnyType[8];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$29
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) (Result.m13476isFailureimpl(obj) ? null : obj);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$30
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$31
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$32
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$33
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$34
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType6;
        AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        AnyType anyType7 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
        if (anyType7 != null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$35
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor7 != null) {
                c = 6;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor7, converters);
        }
        anyTypeArr[c] = anyType7;
        AnyTypeCache anyTypeCache8 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P7");
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P7");
        AnyType anyType8 = anyTypeCache8.getTypesMap().get(new Pair(orCreateKotlinClass8, false));
        if (anyType8 == null) {
            try {
                Result.Companion companion15 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P7");
                TypeInfo throwNonReifiedTypeError8 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$36
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P7");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion16 = Result.INSTANCE;
                m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
            if (m13473exceptionOrNullimpl8 != null) {
                Intrinsics.reifiedOperationMarker(4, "P7");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl8);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                m13470constructorimpl8 = null;
            }
            TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl8;
            if (typeDescriptor8 == null) {
                Intrinsics.reifiedOperationMarker(6, "P7");
                typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType8 = new AnyType(typeDescriptor8, converters);
        }
        anyTypeArr[7] = anyType8;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final AsyncFunctionComponent AsyncFunctionWithoutArgs(String name, final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new Function1<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncFunction(String name, final Function0<? extends R> body) {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$3
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        if (Intrinsics.areEqual(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (Intrinsics.areEqual(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (Intrinsics.areEqual(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (Intrinsics.areEqual(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
        } else if (Intrinsics.areEqual(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunction(String name, final Function1<? super P0, ? extends R> body) {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        if (!Intrinsics.areEqual(Object.class, Promise.class)) {
            TypeConverterProvider converters = getConverters();
            Intrinsics.reifiedOperationMarker(4, "P0");
            AnyType[] anyTypeArr = new AnyType[1];
            AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
            Intrinsics.reifiedOperationMarker(4, "P0");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            Intrinsics.reifiedOperationMarker(3, "P0");
            AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.reifiedOperationMarker(6, "P0");
                    TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                    MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Intrinsics.reifiedOperationMarker(4, "P0");
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    Intrinsics.reifiedOperationMarker(6, "P0");
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            Intrinsics.needClassReification();
            Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final R invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return body.invoke(objArr[0]);
                }
            };
            Intrinsics.reifiedOperationMarker(3, "R");
            Intrinsics.reifiedOperationMarker(4, "R");
            if (Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (Intrinsics.areEqual(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (Intrinsics.areEqual(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (Intrinsics.areEqual(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, function1);
            } else if (Intrinsics.areEqual(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, function1);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
            }
            asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
        } else {
            Intrinsics.needClassReification();
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Function1<P0, R> function12 = body;
                    Intrinsics.reifiedOperationMarker(1, "P0");
                    function12.invoke(promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
        }
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunction(String name, final Function2<? super P0, ? super P1, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        RawTypeDescriptor rawTypeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType2 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType2 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
            } catch (Throwable th) {
                th = th;
                kType = null;
            }
            try {
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl == null) {
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                }
                anyType2 = new AnyType(typeDescriptor, converters);
                anyTypeArr[0] = anyType2;
                AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "P1");
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                Intrinsics.reifiedOperationMarker(3, "P1");
                anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                if (anyType == null) {
                }
                anyTypeArr[1] = anyType;
                Intrinsics.needClassReification();
                Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$8
                    @Override // kotlin.jvm.functions.Function1
                    public final R invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return body.invoke(objArr[0], objArr[1]);
                    }
                };
                Intrinsics.reifiedOperationMarker(3, "R");
                Intrinsics.reifiedOperationMarker(4, "R");
                if (!Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                }
                getAsyncFunctions().put(name, r2);
                return r2;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                z = false;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                z = false;
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType2;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        Intrinsics.needClassReification();
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$8
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function2<? super P0, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        AnyType[] anyTypeArr = new AnyType[1];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$10
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunction(String name, final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        AnyType[] anyTypeArr = new AnyType[3];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType3 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType3 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                kType = null;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    z = false;
                    try {
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                Intrinsics.reifiedOperationMarker(6, "P0");
                                return null;
                            }
                        }));
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                        }
                        anyType3 = new AnyType(typeDescriptor, converters);
                        anyTypeArr[0] = anyType3;
                        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P1");
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P1");
                        anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                        if (anyType == null) {
                        }
                        anyTypeArr[1] = anyType;
                        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P2");
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P2");
                        anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                        if (anyType2 == null) {
                        }
                        anyTypeArr[2] = anyType2;
                        Intrinsics.needClassReification();
                        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$12
                            @Override // kotlin.jvm.functions.Function1
                            public final R invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                return body.invoke(objArr[0], objArr[1], objArr[2]);
                            }
                        };
                        Intrinsics.reifiedOperationMarker(3, "R");
                        Intrinsics.reifiedOperationMarker(4, "R");
                        if (!Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                        }
                        getAsyncFunctions().put(name, r2);
                        return r2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                kType = null;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType3 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType3;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = kType;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        Intrinsics.needClassReification();
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$12
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function3<? super P0, ? super P1, ? super Promise, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        RawTypeDescriptor rawTypeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType2 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType2 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
            } catch (Throwable th) {
                th = th;
                kType = null;
            }
            try {
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl == null) {
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                }
                anyType2 = new AnyType(typeDescriptor, converters);
                anyTypeArr[0] = anyType2;
                AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "P1");
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                Intrinsics.reifiedOperationMarker(3, "P1");
                anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                if (anyType == null) {
                }
                anyTypeArr[1] = anyType;
                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$14
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        body.invoke(objArr[0], objArr[1], promise);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
                getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
                return asyncFunctionWithPromiseComponent;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                z = false;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                z = false;
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType2;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$14
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunction(String name, final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        AnyType[] anyTypeArr = new AnyType[4];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType4 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType4 != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                z = false;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType4 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType4;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, Boolean.valueOf(z)));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    Intrinsics.needClassReification();
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$16
                        @Override // kotlin.jvm.functions.Function1
                        public final R invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
                        }
                    };
                    Intrinsics.reifiedOperationMarker(3, "R");
                    Intrinsics.reifiedOperationMarker(4, "R");
                    if (!Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                    }
                    getAsyncFunctions().put(name, r2);
                    return r2;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType4;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, Boolean.valueOf(z)));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        Intrinsics.needClassReification();
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$16
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function4<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        AnyType[] anyTypeArr = new AnyType[3];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType3 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType3 != null) {
            z = false;
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                kType = null;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    z = false;
                    try {
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                Intrinsics.reifiedOperationMarker(6, "P0");
                                return null;
                            }
                        }));
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                        }
                        anyType3 = new AnyType(typeDescriptor, converters);
                        anyTypeArr[0] = anyType3;
                        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P1");
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P1");
                        anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                        if (anyType == null) {
                        }
                        anyTypeArr[1] = anyType;
                        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "P2");
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "P2");
                        anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                        if (anyType2 == null) {
                        }
                        anyTypeArr[2] = anyType2;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$18
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                body.invoke(objArr[0], objArr[1], objArr[2], promise);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
                        return asyncFunctionWithPromiseComponent;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                kType = null;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType3 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType3;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = kType;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$18
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunction(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        AnyType[] anyTypeArr = new AnyType[5];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$20
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        AnyType[] anyTypeArr = new AnyType[4];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType4 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType4 != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                z = false;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType4 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType4;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, Boolean.valueOf(z)));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$22
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object[] objArr, Promise promise) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            Intrinsics.checkNotNullParameter(promise, "promise");
                            body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], promise);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                            invoke2(objArr, promise);
                            return Unit.INSTANCE;
                        }
                    });
                    getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
                    return asyncFunctionWithPromiseComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType4;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, Boolean.valueOf(z)));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$22
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunction(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        AnyType[] anyTypeArr = new AnyType[6];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) (Result.m13476isFailureimpl(obj) ? null : obj);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType6;
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$24
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        AnyType[] anyTypeArr = new AnyType[5];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$26
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], promise);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunction(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        Object obj;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj2;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        AnyType anyType4;
        Object m13470constructorimpl5;
        AnyType anyType5;
        Object m13470constructorimpl6;
        AnyType anyType6;
        Object m13470constructorimpl7;
        char c;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        AnyType[] anyTypeArr = new AnyType[7];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType7 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType7 != null) {
            obj = "io.github.lukmccall.pika.typeInfo";
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                obj = "io.github.lukmccall.pika.typeInfo";
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl == null) {
                    }
                    typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
                    if (typeDescriptor == null) {
                    }
                    anyType7 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType7;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P5");
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P5");
                    anyType5 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
                    if (anyType5 == null) {
                    }
                    anyTypeArr[5] = anyType5;
                    AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P6");
                    KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P6");
                    anyType6 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
                    if (anyType6 == null) {
                    }
                    anyTypeArr[c] = anyType6;
                    Intrinsics.needClassReification();
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$28
                        @Override // kotlin.jvm.functions.Function1
                        public final R invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
                        }
                    };
                    Intrinsics.reifiedOperationMarker(3, "R");
                    Intrinsics.reifiedOperationMarker(4, "R");
                    if (!Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                    }
                    getAsyncFunctions().put(name, r2);
                    return r2;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = "io.github.lukmccall.pika.typeInfo";
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj2 = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj2 = m13470constructorimpl;
            }
            typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType7;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType4;
        AnyTypeCache anyTypeCache62 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass62 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        anyType5 = anyTypeCache62.getTypesMap().get(new Pair(orCreateKotlinClass62, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType5;
        AnyTypeCache anyTypeCache72 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass72 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        anyType6 = anyTypeCache72.getTypesMap().get(new Pair(orCreateKotlinClass72, false));
        if (anyType6 == null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor7 != null) {
                c = 6;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor7, converters);
        }
        anyTypeArr[c] = anyType6;
        Intrinsics.needClassReification();
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$28
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        AnyType[] anyTypeArr = new AnyType[6];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) (Result.m13476isFailureimpl(obj) ? null : obj);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType6;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$30
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], promise);
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncFunction(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Object m13470constructorimpl7;
        char c;
        Object m13470constructorimpl8;
        String str;
        UntypedAsyncFunctionComponent boolAsyncFunctionComponent;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        Intrinsics.reifiedOperationMarker(4, "P7");
        AnyType[] anyTypeArr = new AnyType[8];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) (Result.m13476isFailureimpl(obj) ? null : obj);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType6;
        AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        AnyType anyType7 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
        if (anyType7 != null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor7 != null) {
                c = 6;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor7, converters);
        }
        anyTypeArr[c] = anyType7;
        AnyTypeCache anyTypeCache8 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P7");
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P7");
        AnyType anyType8 = anyTypeCache8.getTypesMap().get(new Pair(orCreateKotlinClass8, false));
        if (anyType8 == null) {
            try {
                Result.Companion companion15 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P7");
                TypeInfo throwNonReifiedTypeError8 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P7");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion16 = Result.INSTANCE;
                m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
            if (m13473exceptionOrNullimpl8 != null) {
                Intrinsics.reifiedOperationMarker(4, "P7");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl8);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                m13470constructorimpl8 = null;
            }
            TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl8;
            if (typeDescriptor8 == null) {
                Intrinsics.reifiedOperationMarker(6, "P7");
                typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType8 = new AnyType(typeDescriptor8, converters);
        }
        anyTypeArr[7] = anyType8;
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$32
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        if (Intrinsics.areEqual(Object.class, Integer.TYPE)) {
            str = name;
            boolAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function1);
        } else {
            str = name;
            boolAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(str, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(str, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(str, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(str, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(str, anyTypeArr, function1);
        }
        getAsyncFunctions().put(str, boolAsyncFunctionComponent);
        return boolAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
        Object obj;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj2;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        AnyType anyType4;
        Object m13470constructorimpl5;
        AnyType anyType5;
        Object m13470constructorimpl6;
        AnyType anyType6;
        Object m13470constructorimpl7;
        char c;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        AnyType[] anyTypeArr = new AnyType[7];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType7 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType7 != null) {
            obj = "io.github.lukmccall.pika.typeInfo";
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                obj = "io.github.lukmccall.pika.typeInfo";
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl == null) {
                    }
                    typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
                    if (typeDescriptor == null) {
                    }
                    anyType7 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType7;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P5");
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P5");
                    anyType5 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
                    if (anyType5 == null) {
                    }
                    anyTypeArr[5] = anyType5;
                    AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P6");
                    KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P6");
                    anyType6 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
                    if (anyType6 == null) {
                    }
                    anyTypeArr[c] = anyType6;
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$34
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                            invoke2(objArr, promise);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object[] objArr, Promise promise) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            Intrinsics.checkNotNullParameter(promise, "promise");
                            body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], promise);
                        }
                    });
                    getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
                    return asyncFunctionWithPromiseComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = "io.github.lukmccall.pika.typeInfo";
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj2 = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj2 = m13470constructorimpl;
            }
            typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj2) ? null : obj2);
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType7;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, converters);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor5 == null) {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor5, converters);
        }
        anyTypeArr[4] = anyType4;
        AnyTypeCache anyTypeCache62 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass62 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        anyType5 = anyTypeCache62.getTypesMap().get(new Pair(orCreateKotlinClass62, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor6 == null) {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor6, converters);
        }
        anyTypeArr[5] = anyType5;
        AnyTypeCache anyTypeCache72 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass72 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        anyType6 = anyTypeCache72.getTypesMap().get(new Pair(orCreateKotlinClass72, false));
        if (anyType6 == null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor7 != null) {
                c = 6;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor7, converters);
        }
        anyTypeArr[c] = anyType6;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$34
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                Intrinsics.checkNotNullParameter(promise, "promise");
                body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], promise);
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final AsyncFunctionBuilder AsyncFunction(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, this.converters);
        this.asyncFunctionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }

    public final void Events(String... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.eventsDefinition = new EventsDefinition((String[]) ArraysKt.asList(events).toArray(new String[0]));
    }

    public final void EventsWithArray(String[] events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.eventsDefinition = new EventsDefinition(events);
    }

    public final /* synthetic */ <T extends Enum<T> & Enumerable> void Events() {
        ArrayList arrayList;
        List<KParameter> parameters;
        Object obj;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KFunction fastPrimaryConstructor = KClassExtensionsKt.getFastPrimaryConstructor(Reflection.getOrCreateKotlinClass(Enum.class));
        if (fastPrimaryConstructor != null && (parameters = fastPrimaryConstructor.getParameters()) != null && parameters.size() == 1) {
            String name = ((KParameter) CollectionsKt.first((List) fastPrimaryConstructor.getParameters())).getName();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Iterator it = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(Enum.class)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((KProperty1) obj).getName(), name)) {
                        break;
                    }
                }
            }
            KProperty1 kProperty1 = (KProperty1) obj;
            if (kProperty1 == null) {
                throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
            }
            if (!Intrinsics.areEqual(kProperty1.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(String.class))) {
                throw new IllegalArgumentException("The enum parameter has to be a string.".toString());
            }
            Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
            arrayList = new ArrayList(0);
        } else {
            Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
            arrayList = new ArrayList(0);
        }
        setEventsDefinition(new EventsDefinition((String[]) arrayList.toArray(new String[0])));
    }

    public final void OnStartObserving(String eventName, Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public final void OnStartObserving(Enum r2, Function0 body) {
        Intrinsics.checkNotNullParameter(r2, "enum");
        Intrinsics.checkNotNullParameter(body, "body");
        OnStartObserving(EnumExtensionsKt.convertToString(r2), (Function0<Unit>) body);
    }

    public final void OnStartObserving(Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public final void OnStopObserving(String eventName, Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public final void OnStopObserving(Enum r2, Function0 body) {
        Intrinsics.checkNotNullParameter(r2, "enum");
        Intrinsics.checkNotNullParameter(body, "body");
        OnStopObserving(EnumExtensionsKt.convertToString(r2), (Function0<Unit>) body);
    }

    public final void OnStopObserving(Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public PropertyComponentBuilder Property(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        this.properties.put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public final /* synthetic */ <T> PropertyComponentBuilder Property(String name, Function0<? extends T> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilder$get$1$1(body)));
        getProperties().put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public ConstantComponentBuilder Constant(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        this.constants.put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }

    public final /* synthetic */ <T> ConstantComponentBuilder Constant(String name, final Function0<? extends T> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        Intrinsics.needClassReification();
        constantComponentBuilder.setGetter(new Function0<T>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) Function0.this.invoke();
            }
        });
        getConstants().put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }
}
