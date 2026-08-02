package expo.modules.kotlin.functions;

import android.util.Log;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0016\u001a\u00020\u0010\"\u0006\b\u0000\u0010\u0017\u0018\u00012\u001e\b\u0004\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001bJV\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u000123\b\u0004\u0010\u0018\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010!Js\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u00012H\b\u0004\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010%J\u0090\u0001\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u00012]\b\u0004\u0010\u0018\u001aW\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010)J\u00ad\u0001\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u00012r\b\u0004\u0010\u0018\u001al\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010+H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-JÌ\u0001\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u00012\u0088\u0001\b\u0004\u0010\u0018\u001a\u0081\u0001\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010/H\u0086\bø\u0001\u0000¢\u0006\u0002\u00101Jé\u0001\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u00012\u009d\u0001\b\u0004\u0010\u0018\u001a\u0096\u0001\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000103H\u0086\bø\u0001\u0000¢\u0006\u0002\u00105J\u0086\u0002\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u0001\"\u0006\b\u0007\u00106\u0018\u00012²\u0001\b\u0004\u0010\u0018\u001a«\u0001\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u0011H6¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0086\bø\u0001\u0000¢\u0006\u0002\u00109J£\u0002\u0010\u0016\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u0001\"\u0006\b\u0007\u00106\u0018\u0001\"\u0006\b\b\u0010:\u0018\u00012Ç\u0001\b\u0004\u0010\u0018\u001aÀ\u0001\b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u0011H6¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011H:¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(<\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010;H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=J#\u0010>\u001a\u00020?2\u0010\b\u0004\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010AH\u0087\bø\u0001\u0000¢\u0006\u0002\bBJ$\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u00012\u000e\b\u0004\u0010@\u001a\b\u0012\u0004\u0012\u0002H\u00170AH\u0086\bø\u0001\u0000JA\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012#\b\u0004\u0010@\u001a\u001d\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000J^\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u000128\b\u0004\u0010@\u001a2\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u00170\u001eH\u0086\bø\u0001\u0000J[\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u000128\b\u0004\u0010@\u001a2\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u00170\u001eH\u0087\bø\u0001\u0000¢\u0006\u0002\bDJ{\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u00012M\b\u0004\u0010@\u001aG\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H\u00170#H\u0086\bø\u0001\u0000Jx\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u00012M\b\u0004\u0010@\u001aG\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H\u00170#H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJ\u0098\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u00012b\b\u0004\u0010@\u001a\\\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0004\u0012\u0002H\u00170'H\u0086\bø\u0001\u0000J\u0095\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u00012b\b\u0004\u0010@\u001a\\\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0004\u0012\u0002H\u00170'H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJµ\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u00012w\b\u0004\u0010@\u001aq\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002H\u00170+H\u0086\bø\u0001\u0000J²\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u00012w\b\u0004\u0010@\u001aq\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002H\u00170+H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJÔ\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u00012\u008d\u0001\b\u0004\u0010@\u001a\u0086\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002H\u00170/H\u0086\bø\u0001\u0000JÑ\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u00012\u008d\u0001\b\u0004\u0010@\u001a\u0086\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002H\u00170/H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJñ\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u0001\"\u0006\b\u0007\u00106\u0018\u00012¢\u0001\b\u0004\u0010@\u001a\u009b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u0011H6¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002H\u001703H\u0086\bø\u0001\u0000Jî\u0001\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u00012¢\u0001\b\u0004\u0010@\u001a\u009b\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002H\u001703H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJ\u008e\u0002\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u0001\"\u0006\b\u0007\u00106\u0018\u0001\"\u0006\b\b\u0010:\u0018\u00012·\u0001\b\u0004\u0010@\u001a°\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u0011H6¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011H:¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(<\u0012\u0004\u0012\u0002H\u001707H\u0086\bø\u0001\u0000J\u008b\u0002\u0010>\u001a\u00020?\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010\"\u0018\u0001\"\u0006\b\u0003\u0010&\u0018\u0001\"\u0006\b\u0004\u0010*\u0018\u0001\"\u0006\b\u0005\u0010.\u0018\u0001\"\u0006\b\u0006\u00102\u0018\u0001\"\u0006\b\u0007\u00106\u0018\u00012·\u0001\b\u0004\u0010@\u001a°\u0001\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H.¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(0\u0012\u0013\u0012\u0011H2¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(4\u0012\u0013\u0012\u0011H6¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110C¢\u0006\f\b\u001f\u0012\b\b\u0002\u0012\u0004\b\b(<\u0012\u0004\u0012\u0002H\u001707H\u0087\bø\u0001\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020\u0010H\u0000¢\u0006\u0002\bFR\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "", "name", "", "converters", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getConverters$annotations", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "asyncFunctionComponent", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "getAsyncFunctionComponent$annotations", "getAsyncFunctionComponent", "()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "setAsyncFunctionComponent", "(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V", "SuspendBody", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P0", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p0", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P1", "Lkotlin/Function3;", "p1", "(Lkotlin/jvm/functions/Function3;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P2", "Lkotlin/Function4;", "p2", "(Lkotlin/jvm/functions/Function4;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P3", "Lkotlin/Function5;", "p3", "(Lkotlin/jvm/functions/Function5;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P4", "Lkotlin/Function6;", "p4", "(Lkotlin/jvm/functions/Function6;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P5", "Lkotlin/Function7;", "p5", "(Lkotlin/jvm/functions/Function7;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P6", "Lkotlin/Function8;", "p6", "(Lkotlin/jvm/functions/Function8;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P7", "Lkotlin/Function9;", "p7", "(Lkotlin/jvm/functions/Function9;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "AsyncBody", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "body", "Lkotlin/Function0;", "AsyncBodyWithoutArgs", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "build", "build$expo_modules_core_release", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AsyncFunctionBuilder {
    private BaseAsyncFunctionComponent asyncFunctionComponent;
    private final TypeConverterProvider converters;
    private final String name;

    public static /* synthetic */ void getAsyncFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public AsyncFunctionBuilder(String name, TypeConverterProvider typeConverterProvider) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.converters = typeConverterProvider;
    }

    public /* synthetic */ AsyncFunctionBuilder(String str, TypeConverterProvider typeConverterProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : typeConverterProvider);
    }

    public final String getName() {
        return this.name;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final BaseAsyncFunctionComponent getAsyncFunctionComponent() {
        return this.asyncFunctionComponent;
    }

    public final void setAsyncFunctionComponent(BaseAsyncFunctionComponent baseAsyncFunctionComponent) {
        this.asyncFunctionComponent = baseAsyncFunctionComponent;
    }

    public final /* synthetic */ <R> BaseAsyncFunctionComponent SuspendBody(Function1<? super Continuation<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(getName(), new AnyType[0], new AsyncFunctionBuilder$SuspendBody$1(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SuspendFunctionComponent SuspendBody(Function2<? super P0, ? super Continuation<? super R>, ? extends Object> block) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1
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
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$3(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> SuspendFunctionComponent SuspendBody(Function3<? super P0, ? super P1, ? super Continuation<? super R>, ? extends Object> block) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        KType kType;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                z = false;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2
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
                    SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$5(block, kType));
                    setAsyncFunctionComponent(suspendFunctionComponent);
                    return suspendFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                kType = null;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                kType = null;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3
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
        SuspendFunctionComponent suspendFunctionComponent2 = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$5(block, kType));
        setAsyncFunctionComponent(suspendFunctionComponent2);
        return suspendFunctionComponent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> SuspendFunctionComponent SuspendBody(Function4<? super P0, ? super P1, ? super P2, ? super Continuation<? super R>, ? extends Object> block) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                z = false;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    kType = null;
                    try {
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4
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
                        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$7(block, kType));
                        setAsyncFunctionComponent(suspendFunctionComponent);
                        return suspendFunctionComponent;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    kType = null;
                    Result.Companion companion22 = Result.INSTANCE;
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
                    AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    SuspendFunctionComponent suspendFunctionComponent2 = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$7(block, kType));
                    setAsyncFunctionComponent(suspendFunctionComponent2);
                    return suspendFunctionComponent2;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
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
        AnyTypeCache anyTypeCache222 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass222 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache222.getTypesMap().get(new Pair(orCreateKotlinClass222, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5
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
        AnyTypeCache anyTypeCache322 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass322 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache322.getTypesMap().get(new Pair(orCreateKotlinClass322, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6
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
        SuspendFunctionComponent suspendFunctionComponent22 = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$7(block, kType));
        setAsyncFunctionComponent(suspendFunctionComponent22);
        return suspendFunctionComponent22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> SuspendFunctionComponent SuspendBody(Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super Continuation<? super R>, ? extends Object> block) {
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
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7
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
                    SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$9(block, kType));
                    setAsyncFunctionComponent(suspendFunctionComponent);
                    return suspendFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
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
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8
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
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10
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
        SuspendFunctionComponent suspendFunctionComponent2 = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$9(block, kType));
        setAsyncFunctionComponent(suspendFunctionComponent2);
        return suspendFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SuspendFunctionComponent SuspendBody(Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Continuation<? super R>, ? extends Object> block) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15
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
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$11(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SuspendFunctionComponent SuspendBody(Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Continuation<? super R>, ? extends Object> block) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21
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
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$13(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x041a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SuspendFunctionComponent SuspendBody(Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Continuation<? super R>, ? extends Object> block) {
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
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22
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
                    SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$15(block, null));
                    setAsyncFunctionComponent(suspendFunctionComponent);
                    return suspendFunctionComponent;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28
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
        SuspendFunctionComponent suspendFunctionComponent2 = new SuspendFunctionComponent(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$15(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent2);
        return suspendFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0426 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x038f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SuspendFunctionComponent SuspendBody(Function9<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super Continuation<? super R>, ? extends Object> block) {
        String str;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj;
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
        Intrinsics.checkNotNullParameter(block, "block");
        String name = getName();
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
            str = name;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                str = name;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29
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
                    typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj) ? null : obj);
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
                    SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(str, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$17(block, null));
                    setAsyncFunctionComponent(suspendFunctionComponent);
                    return suspendFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                str = name;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj) ? null : obj);
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36
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
        SuspendFunctionComponent suspendFunctionComponent2 = new SuspendFunctionComponent(str, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$17(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent2);
        return suspendFunctionComponent2;
    }

    public final AsyncFunctionComponent AsyncBodyWithoutArgs(final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(getName(), new AnyType[0], new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncBody(final Function0<? extends R> body) {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        Intrinsics.needClassReification();
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$3
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
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncBody(final Function1<? super P0, ? extends R> body) {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        if (Object.class != Promise.class) {
            String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1
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
            Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$6
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
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(getName(), new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$5
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncBody(final Function2<? super P0, ? super P1, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2
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
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$8
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
                    setAsyncFunctionComponent(r1);
                    return r1;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$8
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(final Function2<? super P0, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$10
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncBody(final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5
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
                        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$12
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
                        setAsyncFunctionComponent(r1);
                        return r1;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$12
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(final Function3<? super P0, ? super P1, ? super Promise, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        boolean z;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8
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
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$14
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
                    setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
                    return asyncFunctionWithPromiseComponent;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$14
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncBody(final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
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
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10
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
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$16
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
                    setAsyncFunctionComponent(r1);
                    return r1;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$16
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(final Function4<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
        boolean z;
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14
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
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$18
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
                        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$18
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncBody(final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21
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
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$20
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
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
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22
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
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$22
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
                    setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$22
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncBody(final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31
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
        Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$24
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function1) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function1) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function1);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$26
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x041a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncBody(final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
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
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37
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
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$28
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
                    setAsyncFunctionComponent(r1);
                    return r1;
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43
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
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$28
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        UntypedAsyncFunctionComponent intAsyncFunctionComponent = !Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(name, anyTypeArr, function12);
        setAsyncFunctionComponent(intAsyncFunctionComponent);
        return intAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$30
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0426 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x038f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncBody(final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        String str;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj;
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
        UntypedAsyncFunctionComponent boolAsyncFunctionComponent;
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
            str = name;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                str = name;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50
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
                    typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj) ? null : obj);
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
                    Intrinsics.needClassReification();
                    Function1<Object[], R> function1 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$32
                        @Override // kotlin.jvm.functions.Function1
                        public final R invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
                        }
                    };
                    Intrinsics.reifiedOperationMarker(3, "R");
                    Intrinsics.reifiedOperationMarker(4, "R");
                    if (Intrinsics.areEqual(Object.class, Integer.TYPE)) {
                    }
                    setAsyncFunctionComponent(boolAsyncFunctionComponent);
                    return boolAsyncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                str = name;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            typeDescriptor = (TypeDescriptor) (!Result.m13476isFailureimpl(obj) ? null : obj);
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56
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
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57
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
        Intrinsics.needClassReification();
        Function1<Object[], R> function12 = new Function1<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$32
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        };
        Intrinsics.reifiedOperationMarker(3, "R");
        Intrinsics.reifiedOperationMarker(4, "R");
        if (Intrinsics.areEqual(Object.class, Integer.TYPE)) {
            String str2 = str;
            boolAsyncFunctionComponent = Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(str2, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(str2, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(str2, anyTypeArr, function12) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent(str2, anyTypeArr, function12) : new UntypedAsyncFunctionComponent(str2, anyTypeArr, function12);
        } else {
            boolAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, function12);
        }
        setAsyncFunctionComponent(boolAsyncFunctionComponent);
        return boolAsyncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x041a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
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
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
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
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58
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
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$34
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
                    setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
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
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59
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
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60
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
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61
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
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62
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
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63
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
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64
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
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent(name, anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$34
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
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent2);
        return asyncFunctionWithPromiseComponent2;
    }

    public final BaseAsyncFunctionComponent build$expo_modules_core_release() {
        BaseAsyncFunctionComponent baseAsyncFunctionComponent = this.asyncFunctionComponent;
        if (baseAsyncFunctionComponent != null) {
            return baseAsyncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
