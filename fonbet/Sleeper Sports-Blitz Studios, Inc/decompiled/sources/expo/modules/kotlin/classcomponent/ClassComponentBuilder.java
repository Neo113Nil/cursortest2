package expo.modules.kotlin.classcomponent;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.functions.AnyFunction;
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
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$get$1$1;
import expo.modules.kotlin.sharedobjects.SharedObjectKt;
import expo.modules.kotlin.sharedobjects.SharedRefKt;
import expo.modules.kotlin.traits.Trait;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
import kotlin.reflect.KType;

/* compiled from: ClassComponentBuilder.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u0002062\u000e\u00107\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001cJ\u001c\u00108\u001a\u00020\u00152\u000e\b\u0004\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0086\bø\u0001\u0000J9\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u00012#\b\u0004\u00109\u001a\u001d\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0004\u0012\u00028\u00000<H\u0086\bø\u0001\u0000JV\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u000128\b\u0004\u00109\u001a2\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0004\u0012\u00028\u00000@H\u0086\bø\u0001\u0000Js\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u00012M\b\u0004\u00109\u001aG\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0004\u0012\u00028\u00000CH\u0086\bø\u0001\u0000J\u0090\u0001\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u0001\"\u0006\b\u0004\u0010E\u0018\u00012b\b\u0004\u00109\u001a\\\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0004\u0012\u00028\u00000FH\u0086\bø\u0001\u0000J\u00ad\u0001\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u0001\"\u0006\b\u0004\u0010E\u0018\u0001\"\u0006\b\u0005\u0010H\u0018\u00012w\b\u0004\u00109\u001aq\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0004\u0012\u00028\u00000IH\u0086\bø\u0001\u0000JÌ\u0001\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u0001\"\u0006\b\u0004\u0010E\u0018\u0001\"\u0006\b\u0005\u0010H\u0018\u0001\"\u0006\b\u0006\u0010K\u0018\u00012\u008d\u0001\b\u0004\u00109\u001a\u0086\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0004\u0012\u00028\u00000LH\u0086\bø\u0001\u0000Jé\u0001\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u0001\"\u0006\b\u0004\u0010E\u0018\u0001\"\u0006\b\u0005\u0010H\u0018\u0001\"\u0006\b\u0006\u0010K\u0018\u0001\"\u0006\b\u0007\u0010N\u0018\u00012¢\u0001\b\u0004\u00109\u001a\u009b\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0004\u0012\u00028\u00000OH\u0086\bø\u0001\u0000J\u0086\u0002\u00108\u001a\u00020\u0015\"\u0006\b\u0001\u0010;\u0018\u0001\"\u0006\b\u0002\u0010?\u0018\u0001\"\u0006\b\u0003\u0010B\u0018\u0001\"\u0006\b\u0004\u0010E\u0018\u0001\"\u0006\b\u0005\u0010H\u0018\u0001\"\u0006\b\u0006\u0010K\u0018\u0001\"\u0006\b\u0007\u0010N\u0018\u0001\"\u0006\b\b\u0010Q\u0018\u00012·\u0001\b\u0004\u00109\u001a°\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u0011HQ¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(S\u0012\u0004\u0012\u00028\u00000RH\u0086\bø\u0001\u0000JG\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\u0006\b\u0001\u0010V\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072#\b\u0004\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(W\u0012\u0004\u0012\u0002HV0<H\u0086\bø\u0001\u0000J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000U2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010X\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0007J+\u0010X\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0004\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020:H\u0087\bø\u0001\u0000¢\u0006\u0002\bYJ,\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0004\u00109\u001a\b\u0012\u0004\u0012\u0002HZ0:H\u0086\bø\u0001\u0000JI\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072#\b\u0004\u00109\u001a\u001d\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0004\u0012\u0002HZ0<H\u0086\bø\u0001\u0000Jf\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u000728\b\u0004\u00109\u001a2\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0004\u0012\u0002HZ0@H\u0086\bø\u0001\u0000J\u0083\u0001\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072M\b\u0004\u00109\u001aG\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0004\u0012\u0002HZ0CH\u0086\bø\u0001\u0000J \u0001\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072b\b\u0004\u00109\u001a\\\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0004\u0012\u0002HZ0FH\u0086\bø\u0001\u0000J½\u0001\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072w\b\u0004\u00109\u001aq\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0004\u0012\u0002HZ0IH\u0086\bø\u0001\u0000JÜ\u0001\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u008d\u0001\b\u0004\u00109\u001a\u0086\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0004\u0012\u0002HZ0LH\u0086\bø\u0001\u0000Jù\u0001\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u0001\"\u0006\b\b\u0010N\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072¢\u0001\b\u0004\u00109\u001a\u009b\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002HZ0OH\u0086\bø\u0001\u0000J\u0096\u0002\u0010X\u001a\u00020\u0015\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u0001\"\u0006\b\b\u0010N\u0018\u0001\"\u0006\b\t\u0010Q\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072·\u0001\b\u0004\u00109\u001a°\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u0011HQ¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(S\u0012\u0004\u0012\u0002HZ0RH\u0086\bø\u0001\u0000J\u000e\u0010[\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\u0007J+\u0010[\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0004\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020:H\u0087\bø\u0001\u0000¢\u0006\u0002\b\\J,\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0004\u00109\u001a\b\u0012\u0004\u0012\u0002HZ0:H\u0086\bø\u0001\u0000JI\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072#\b\u0004\u00109\u001a\u001d\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0004\u0012\u0002HZ0<H\u0086\bø\u0001\u0000Jf\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u000728\b\u0004\u00109\u001a2\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0004\u0012\u0002HZ0@H\u0086\bø\u0001\u0000Jc\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u000728\b\u0004\u00109\u001a2\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0004\u0012\u0002HZ0@H\u0087\bø\u0001\u0000¢\u0006\u0002\b^J\u0083\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072M\b\u0004\u00109\u001aG\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0004\u0012\u0002HZ0CH\u0086\bø\u0001\u0000J\u0080\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072M\b\u0004\u00109\u001aG\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0004\u0012\u0002HZ0CH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J \u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072b\b\u0004\u00109\u001a\\\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0004\u0012\u0002HZ0FH\u0086\bø\u0001\u0000J\u009d\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072b\b\u0004\u00109\u001a\\\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0004\u0012\u0002HZ0FH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J½\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072w\b\u0004\u00109\u001aq\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0004\u0012\u0002HZ0IH\u0086\bø\u0001\u0000Jº\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072w\b\u0004\u00109\u001aq\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0004\u0012\u0002HZ0IH\u0087\bø\u0001\u0000¢\u0006\u0002\b^JÜ\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u008d\u0001\b\u0004\u00109\u001a\u0086\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0004\u0012\u0002HZ0LH\u0086\bø\u0001\u0000JÙ\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u008d\u0001\b\u0004\u00109\u001a\u0086\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0004\u0012\u0002HZ0LH\u0087\bø\u0001\u0000¢\u0006\u0002\b^Jù\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u0001\"\u0006\b\b\u0010N\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072¢\u0001\b\u0004\u00109\u001a\u009b\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002HZ0OH\u0086\bø\u0001\u0000Jö\u0001\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072¢\u0001\b\u0004\u00109\u001a\u009b\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002HZ0OH\u0087\bø\u0001\u0000¢\u0006\u0002\b^J\u0096\u0002\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u0001\"\u0006\b\b\u0010N\u0018\u0001\"\u0006\b\t\u0010Q\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072·\u0001\b\u0004\u00109\u001a°\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u0011HQ¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(S\u0012\u0004\u0012\u0002HZ0RH\u0086\bø\u0001\u0000J\u0093\u0002\u0010[\u001a\u00020-\"\u0006\b\u0001\u0010Z\u0018\u0001\"\u0006\b\u0002\u0010;\u0018\u0001\"\u0006\b\u0003\u0010?\u0018\u0001\"\u0006\b\u0004\u0010B\u0018\u0001\"\u0006\b\u0005\u0010E\u0018\u0001\"\u0006\b\u0006\u0010H\u0018\u0001\"\u0006\b\u0007\u0010K\u0018\u0001\"\u0006\b\b\u0010N\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072·\u0001\b\u0004\u00109\u001a°\u0001\u0012\u0013\u0012\u0011H;¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(>\u0012\u0013\u0012\u0011H?¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011HB¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011HE¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(G\u0012\u0013\u0012\u0011HH¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\u0013\u0012\u0011HK¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(M\u0012\u0013\u0012\u0011HN¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110]¢\u0006\f\b=\u0012\b\b\u0006\u0012\u0004\b\b(S\u0012\u0004\u0012\u0002HZ0RH\u0087\bø\u0001\u0000¢\u0006\u0002\b^R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR0\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R0\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-0 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\"\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002020 X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006_"}, d2 = {"Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;", "SharedObjectType", "", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "appContext", "Lexpo/modules/kotlin/AppContext;", "name", "", "ownerClass", "Lkotlin/reflect/KClass;", "ownerType", "Lexpo/modules/kotlin/types/AnyType;", "converters", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;Lkotlin/reflect/KClass;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "getName", "()Ljava/lang/String;", "getOwnerType", "()Lexpo/modules/kotlin/types/AnyType;", "constructor", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getConstructor", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setConstructor", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "traits", "", "Lexpo/modules/kotlin/traits/Trait;", "getTraits", "()Ljava/util/List;", "staticSyncFunctions", "", "getStaticSyncFunctions$annotations", "()V", "getStaticSyncFunctions", "()Ljava/util/Map;", "setStaticSyncFunctions", "(Ljava/util/Map;)V", "staticSyncFunctionBuilder", "Lexpo/modules/kotlin/functions/FunctionBuilder;", "getStaticSyncFunctionBuilder$annotations", "getStaticSyncFunctionBuilder", "setStaticSyncFunctionBuilder", "staticAsyncFunctions", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "getStaticAsyncFunctions$annotations", "getStaticAsyncFunctions", "setStaticAsyncFunctions", "staticAsyncFunctionBuilders", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "buildClass", "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "UseTrait", "", "trait", "Constructor", "body", "Lkotlin/Function0;", "P0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p0", "P1", "Lkotlin/Function2;", "p1", "P2", "Lkotlin/Function3;", "p2", "P3", "Lkotlin/Function4;", "p3", "P4", "Lkotlin/Function5;", "p4", "P5", "Lkotlin/Function6;", "p5", "P6", "Lkotlin/Function7;", "p6", "P7", "Lkotlin/Function8;", "p7", "Property", "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", ExifInterface.GPS_DIRECTION_TRUE, "owner", "StaticFunction", "StaticFunctionWithoutArgs", "R", "StaticAsyncFunction", "StaticAsyncFunctionWithoutArgs", "Lexpo/modules/kotlin/Promise;", "StaticAsyncFunctionWithPromise", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClassComponentBuilder<SharedObjectType> extends ObjectDefinitionBuilder {
    private final AppContext appContext;
    private SyncFunctionComponent constructor;
    private final String name;
    private final KClass<SharedObjectType> ownerClass;
    private final AnyType ownerType;
    private Map<String, AsyncFunctionBuilder> staticAsyncFunctionBuilders;
    private Map<String, AsyncFunctionComponent> staticAsyncFunctions;
    private Map<String, FunctionBuilder> staticSyncFunctionBuilder;
    private Map<String, SyncFunctionComponent> staticSyncFunctions;
    private final List<Trait<? super SharedObjectType>> traits;

    public static /* synthetic */ void getStaticAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getStaticSyncFunctionBuilder$annotations() {
    }

    public static /* synthetic */ void getStaticSyncFunctions$annotations() {
    }

    public /* synthetic */ ClassComponentBuilder(AppContext appContext, String str, KClass kClass, AnyType anyType, TypeConverterProvider typeConverterProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appContext, str, kClass, anyType, (i & 16) != 0 ? null : typeConverterProvider);
    }

    public final String getName() {
        return this.name;
    }

    public final AnyType getOwnerType() {
        return this.ownerType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassComponentBuilder(AppContext appContext, String name, KClass<SharedObjectType> ownerClass, AnyType ownerType, TypeConverterProvider typeConverterProvider) {
        super(typeConverterProvider);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        this.appContext = appContext;
        this.name = name;
        this.ownerClass = ownerClass;
        this.ownerType = ownerType;
        this.traits = new ArrayList();
        this.staticSyncFunctions = new LinkedHashMap();
        this.staticSyncFunctionBuilder = new LinkedHashMap();
        this.staticAsyncFunctions = new LinkedHashMap();
        this.staticAsyncFunctionBuilders = new LinkedHashMap();
    }

    public final SyncFunctionComponent getConstructor() {
        return this.constructor;
    }

    public final void setConstructor(SyncFunctionComponent syncFunctionComponent) {
        this.constructor = syncFunctionComponent;
    }

    public final List<Trait<? super SharedObjectType>> getTraits() {
        return this.traits;
    }

    public final Map<String, SyncFunctionComponent> getStaticSyncFunctions() {
        return this.staticSyncFunctions;
    }

    public final void setStaticSyncFunctions(Map<String, SyncFunctionComponent> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.staticSyncFunctions = map;
    }

    public final Map<String, FunctionBuilder> getStaticSyncFunctionBuilder() {
        return this.staticSyncFunctionBuilder;
    }

    public final void setStaticSyncFunctionBuilder(Map<String, FunctionBuilder> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.staticSyncFunctionBuilder = map;
    }

    public final Map<String, AsyncFunctionComponent> getStaticAsyncFunctions() {
        return this.staticAsyncFunctions;
    }

    public final void setStaticAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.staticAsyncFunctions = map;
    }

    public final ClassDefinitionData buildClass() {
        Object m13470constructorimpl;
        boolean areEqual = Intrinsics.areEqual(this.ownerClass, Reflection.getOrCreateKotlinClass(Unit.class));
        boolean z = !areEqual && SharedObjectKt.isSharedObjectClass(this.ownerClass);
        boolean z2 = !areEqual && SharedRefKt.isSharedRefClass(this.ownerClass);
        Object obj = null;
        if (getEventsDefinition() != null && z) {
            for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("__expo_onStartListeningToEvent", ClassComponentBuilder$buildClass$1.INSTANCE), TuplesKt.to("__expo_onStopListeningToEvent", ClassComponentBuilder$buildClass$2.INSTANCE)})) {
                String str = (String) pair.component1();
                final KFunction kFunction = (KFunction) pair.component2();
                AnyType[] anyTypeArr = new AnyType[2];
                anyTypeArr[0] = this.ownerType;
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$lambda$2$$inlined$toAnyType$default$1
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
                    anyType = new AnyType(typeDescriptor, null);
                }
                anyTypeArr[1] = anyType;
                ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Unit.class));
                if (returnType == null) {
                    returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Unit.class));
                    returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Unit.class), returnType);
                }
                SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit buildClass$lambda$2$lambda$0;
                        buildClass$lambda$2$lambda$0 = ClassComponentBuilder.buildClass$lambda$2$lambda$0(KFunction.this, (Object[]) obj2);
                        return buildClass$lambda$2$lambda$0;
                    }
                });
                syncFunctionComponent.enumerable(false);
                getSyncFunctions().put(str, syncFunctionComponent);
            }
        }
        ObjectDefinitionData buildObject = buildObject();
        List<Trait<? super SharedObjectType>> list = this.traits;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Trait) it.next()).export(this.appContext));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            while (it2.hasNext()) {
                obj = ((ObjectDefinitionData) obj).plus((ObjectDefinitionData) it2.next());
            }
        }
        ObjectDefinitionData plus = buildObject.plus((ObjectDefinitionData) obj);
        ConcatIterator<AnyFunction> functions = plus.getFunctions();
        while (functions.hasNext()) {
            AnyFunction next = functions.next();
            next.setOwnerType(this.ownerType.getTypeDescriptor());
            next.setCanTakeOwner(true);
        }
        if (!areEqual && this.constructor == null && !z2) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        SyncFunctionComponent syncFunctionComponent2 = this.constructor;
        if (syncFunctionComponent2 == null) {
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Unit.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Unit.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Unit.class), returnType2);
            }
            syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit buildClass$lambda$6;
                    buildClass$lambda$6 = ClassComponentBuilder.buildClass$lambda$6((Object[]) obj2);
                    return buildClass$lambda$6;
                }
            });
        }
        SyncFunctionComponent syncFunctionComponent3 = syncFunctionComponent2;
        syncFunctionComponent3.setCanTakeOwner(true);
        syncFunctionComponent3.setOwnerType(this.ownerType.getTypeDescriptor());
        String str2 = this.name;
        Map<String, SyncFunctionComponent> map = this.staticSyncFunctions;
        Map<String, FunctionBuilder> map2 = this.staticSyncFunctionBuilder;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
        Iterator<T> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(entry.getKey(), ((FunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map plus2 = MapsKt.plus(map, linkedHashMap);
        Map<String, AsyncFunctionComponent> map3 = this.staticAsyncFunctions;
        Map<String, AsyncFunctionBuilder> map4 = this.staticAsyncFunctionBuilders;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map4.size()));
        Iterator<T> it4 = map4.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            linkedHashMap2.put(entry2.getKey(), ((AsyncFunctionBuilder) entry2.getValue()).build$expo_modules_core_release());
        }
        return new ClassDefinitionData(str2, syncFunctionComponent3, plus2, MapsKt.plus(map3, linkedHashMap2), plus, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildClass$lambda$2$lambda$0(KFunction kFunction, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
        ((Function2) kFunction).invoke(objArr[0], objArr[1]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildClass$lambda$6(Object[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void UseTrait(Trait<? super SharedObjectType> trait) {
        Intrinsics.checkNotNullParameter(trait, "trait");
        this.traits.add(trait);
    }

    public final SyncFunctionComponent Constructor(final Function0<? extends SharedObjectType> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0> SyncFunctionComponent Constructor(final Function1<? super P0, ? extends SharedObjectType> body) {
        Object m13470constructorimpl;
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$1
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
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1> SyncFunctionComponent Constructor(final Function2<? super P0, ? super P1, ? extends SharedObjectType> body) {
        Object m13470constructorimpl;
        KType kType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(body, "body");
        TypeConverterProvider converters = getConverters();
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType != null) {
            kType = null;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$2
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
                kType = null;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                kType = null;
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$3
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
                m13470constructorimpl2 = kType;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <P0, P1, P2> SyncFunctionComponent Constructor(final Function3<? super P0, ? super P1, ? super P2, ? extends SharedObjectType> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        ReturnType returnType;
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
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$4
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
                    returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2]);
                        }
                    });
                    setConstructor(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                kType = null;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$5
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$6
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
        returnType = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        setConstructor(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <P0, P1, P2, P3> SyncFunctionComponent Constructor(final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends SharedObjectType> body) {
        boolean z;
        KType kType;
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$7
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
                        returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                        if (returnType == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
                            }
                        });
                        setConstructor(syncFunctionComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$8
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$9
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = kType;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType3 = new AnyType(typeDescriptor4, converters);
        }
        anyTypeArr[3] = anyType3;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        returnType = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        setConstructor(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <P0, P1, P2, P3, P4> SyncFunctionComponent Constructor(final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends SharedObjectType> body) {
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
        AnyType anyType4;
        Object m13470constructorimpl5;
        ReturnType returnType;
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
        AnyType anyType5 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType5 != null) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$11
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
                    anyType5 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType5;
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
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, Boolean.valueOf(z)));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                        }
                    });
                    setConstructor(syncFunctionComponent);
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
            anyType5 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType5;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$12
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$13
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$14
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
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, Boolean.valueOf(z)));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$15
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
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        returnType = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        setConstructor(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5> SyncFunctionComponent Constructor(final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends SharedObjectType> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$16
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$17
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$18
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$19
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$20
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$21
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
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Constructor(final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends SharedObjectType> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Object m13470constructorimpl7;
        char c;
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
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$22
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$23
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$24
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$25
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$26
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$27
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$28
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
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0420 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0389 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Constructor(final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends SharedObjectType> body) {
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
        AnyType anyType7;
        Object m13470constructorimpl8;
        ReturnType returnType;
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
        AnyType anyType8 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType8 != null) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$29
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
                    anyType8 = new AnyType(typeDescriptor, converters);
                    anyTypeArr[0] = anyType8;
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
                    AnyTypeCache anyTypeCache8 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P7");
                    KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P7");
                    anyType7 = anyTypeCache8.getTypesMap().get(new Pair(orCreateKotlinClass8, false));
                    if (anyType7 == null) {
                    }
                    anyTypeArr[7] = anyType7;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$17
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
                        }
                    });
                    setConstructor(syncFunctionComponent);
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
            anyType8 = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType8;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$30
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$31
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$32
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$33
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$34
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$35
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
        AnyTypeCache anyTypeCache82 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P7");
        KClass orCreateKotlinClass82 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P7");
        anyType7 = anyTypeCache82.getTypesMap().get(new Pair(orCreateKotlinClass82, false));
        if (anyType7 == null) {
            try {
                Result.Companion companion15 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P7");
                TypeInfo throwNonReifiedTypeError8 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$36
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P7");
                        return null;
                    }
                }));
            } catch (Throwable th9) {
                Result.Companion companion16 = Result.INSTANCE;
                m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
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
            anyType7 = new AnyType(typeDescriptor8, converters);
        }
        anyTypeArr[7] = anyType7;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        returnType = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
        setConstructor(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<SharedObjectType> Property(String name, Function1<? super SharedObjectType, ? extends T> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(getOwnerType().getTypeDescriptor(), name);
        AnyType[] anyTypeArr = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    @Override // expo.modules.kotlin.objects.ObjectDefinitionBuilder
    public PropertyComponentBuilderWithThis<SharedObjectType> Property(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(this.ownerType.getTypeDescriptor(), name);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    public final FunctionBuilder StaticFunction(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        FunctionBuilder functionBuilder = new FunctionBuilder(name);
        this.staticSyncFunctionBuilder.put(name, functionBuilder);
        return functionBuilder;
    }

    public final SyncFunctionComponent StaticFunctionWithoutArgs(String name, final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R> SyncFunctionComponent StaticFunction(String name, final Function0<? extends R> body) {
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent StaticFunction(String name, final Function1<? super P0, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$1
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent StaticFunction(String name, final Function2<? super P0, ? super P1, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$2
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
                SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return body.invoke(objArr[0], objArr[1]);
                    }
                });
                getStaticSyncFunctions().put(name, syncFunctionComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$3
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
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent2);
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
    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent StaticFunction(String name, final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$4
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
                        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                return body.invoke(objArr[0], objArr[1], objArr[2]);
                            }
                        });
                        getStaticSyncFunctions().put(name, syncFunctionComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$5
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$6
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
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent2);
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
    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent StaticFunction(String name, final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$7
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
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
                        }
                    });
                    getStaticSyncFunctions().put(name, syncFunctionComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$8
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$9
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$10
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
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent StaticFunction(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$11
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$12
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$13
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$14
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$15
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent StaticFunction(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$16
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$17
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$18
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$19
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$20
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$21
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent StaticFunction(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$22
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
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
                        }
                    });
                    getStaticSyncFunctions().put(name, syncFunctionComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$23
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$24
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$25
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$26
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$27
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$28
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
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent StaticFunction(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$29
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$30
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$31
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$32
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$33
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$34
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$35
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
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$$inlined$toArgsArray$default$36
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticFunction$20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
        getStaticSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final AsyncFunctionBuilder StaticAsyncFunction(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, getConverters());
        this.staticAsyncFunctionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }

    public final AsyncFunctionComponent StaticAsyncFunctionWithoutArgs(String name, final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new Function1<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R> AsyncFunctionComponent StaticAsyncFunction(String name, final Function0<? extends R> body) {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$4
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
        getStaticAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent StaticAsyncFunction(String name, final Function1<? super P0, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$1
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
            Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$7
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
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$6
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent StaticAsyncFunction(String name, final Function2<? super P0, ? super P1, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$2
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
                Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$9
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
                getStaticAsyncFunctions().put(name, r2);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$3
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$9
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function2<? super P0, ? super Promise, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$4
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$11
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent StaticAsyncFunction(String name, final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$5
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
                        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$13
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
                        getStaticAsyncFunctions().put(name, r2);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$6
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$7
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$13
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function3<? super P0, ? super P1, ? super Promise, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$8
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
                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$15
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
                getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$9
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$15
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
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
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent StaticAsyncFunction(String name, final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$10
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
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$17
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
                    getStaticAsyncFunctions().put(name, r2);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$11
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$12
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$13
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$17
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function4<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$14
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
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$19
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
                        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$15
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$16
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$19
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent StaticAsyncFunction(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$17
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$18
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$19
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$20
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$21
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
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$21
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$22
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
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$23
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
                    getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$23
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$24
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$25
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$23
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent StaticAsyncFunction(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$26
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$27
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$28
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$29
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$30
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$31
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
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$25
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$32
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$33
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$34
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$35
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$36
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$27
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent StaticAsyncFunction(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$37
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
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$29
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
                    getStaticAsyncFunctions().put(name, r2);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$38
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$39
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$40
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$41
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$42
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$43
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$29
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        getStaticAsyncFunctions().put(name, intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$44
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$45
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$46
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$47
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$48
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$49
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$31
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent StaticAsyncFunction(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$50
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$51
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$52
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$53
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$54
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$55
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$56
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
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$57
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
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$33
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
        getStaticAsyncFunctions().put(str, boolAsyncFunctionComponent);
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
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent StaticAsyncFunctionWithPromise(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$58
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
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$35
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
                    getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$59
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$60
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$61
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$62
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$63
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$$inlined$toArgsArray$default$64
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$StaticAsyncFunction$35
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
        getStaticAsyncFunctions().put(name, asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }
}
