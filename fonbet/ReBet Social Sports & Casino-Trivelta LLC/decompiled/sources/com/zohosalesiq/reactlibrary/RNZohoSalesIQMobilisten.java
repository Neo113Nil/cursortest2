package com.zohosalesiq.reactlibrary;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0003\b\u009b\u0001\u0018\u0000 å\u00012\u00020\u0001:\u0002æ\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b$\u0010\u0018J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0012H\u0017¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0012H\u0017¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0012H\u0017¢\u0006\u0004\b*\u0010\u0018J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0012H\u0017¢\u0006\u0004\b,\u0010\u001bJ\u001f\u0010/\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0017¢\u0006\u0004\b/\u00100J'\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u0012H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u000eH\u0017¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u000eH\u0017¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u000eH\u0017¢\u0006\u0004\b9\u00106J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0010H\u0017¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u000eH\u0017¢\u0006\u0004\bB\u00106J#\u0010E\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\bE\u00100J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0010H\u0017¢\u0006\u0004\bG\u0010<J\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u000eH\u0017¢\u0006\u0004\bI\u00106J\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u000eH\u0017¢\u0006\u0004\bK\u00106J\u0019\u0010M\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010LH\u0017¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u000eH\u0017¢\u0006\u0004\bP\u00106J\u0017\u0010R\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0004\bR\u0010<J\u0017\u0010S\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0004\bS\u0010<J\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0004\bT\u0010<J\u0017\u0010V\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0010H\u0017¢\u0006\u0004\bV\u0010<J\u000f\u0010W\u001a\u00020\u0006H\u0017¢\u0006\u0004\bW\u0010\bJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u000eH\u0017¢\u0006\u0004\bY\u00106J\u0017\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\tH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0010H\u0017¢\u0006\u0004\b]\u0010<J\u0017\u0010^\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u000eH\u0017¢\u0006\u0004\b^\u00106J\u0017\u0010_\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0004\b_\u0010<J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u000eH\u0017¢\u0006\u0004\ba\u00106J\u0017\u0010b\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u000eH\u0017¢\u0006\u0004\bb\u00106J\u0017\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u000eH\u0017¢\u0006\u0004\bd\u00106J\u001f\u0010g\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u000eH\u0017¢\u0006\u0004\bg\u00100J\u0017\u0010i\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u000eH\u0017¢\u0006\u0004\bi\u00106J\u0017\u0010j\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u000eH\u0017¢\u0006\u0004\bj\u00106J\u0017\u0010k\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0004\bk\u0010<J\u000f\u0010l\u001a\u00020\u0006H\u0017¢\u0006\u0004\bl\u0010\bJ\u0017\u0010n\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u0010H\u0017¢\u0006\u0004\bn\u0010<J\u0017\u0010o\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\bo\u0010@J\u0017\u0010q\u001a\u00020\u00062\u0006\u0010p\u001a\u00020=H\u0017¢\u0006\u0004\bq\u0010@J\u0017\u0010s\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\tH\u0017¢\u0006\u0004\bs\u0010\\J\u001f\u0010u\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\bu\u0010vJ\u001f\u0010y\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u0010H\u0017¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b{\u0010vJ\u0017\u0010}\u001a\u00020\u00062\u0006\u0010|\u001a\u00020\u000eH\u0017¢\u0006\u0004\b}\u00106J-\u0010\u007f\u001a\u00020\u00062\b\u0010~\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u007f\u00103J\u0019\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u0080\u0001\u00106J\u0019\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0010H\u0017¢\u0006\u0005\b\u0081\u0001\u0010<J\"\u0010\u0083\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0083\u0001\u0010\u001bJ\u0019\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0084\u0001\u0010\u0018J\u0019\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u0085\u0001\u00106J\u001a\u0010\u0087\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u0087\u0001\u00106J#\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\u0007\u0010\u0088\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\b\u0089\u0001\u0010zJ\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u008a\u0001\u0010\bJ\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u008b\u0001\u0010\bJ\u001a\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u008d\u0001\u00106J\u001c\u0010\u008f\u0001\u001a\u00020\u00062\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0005\b\u008f\u0001\u0010\\J#\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u0091\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\b\u0092\u0001\u0010zJ\u001a\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\b\u0093\u0001\u0010<J\u0011\u0010\u0094\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u0094\u0001\u0010\bJ\u0011\u0010\u0095\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u0095\u0001\u0010\bJ\u0011\u0010\u0096\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u0096\u0001\u0010\bJ\u0011\u0010\u0097\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u0097\u0001\u0010\bJ\u001a\u0010\u0098\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u0098\u0001\u00106J\u001a\u0010\u0099\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u0099\u0001\u00106J\u0011\u0010\u009a\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b\u009a\u0001\u0010\bJ\u001a\u0010\u009c\u0001\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020=H\u0017¢\u0006\u0005\b\u009c\u0001\u0010@J\u001a\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b\u009e\u0001\u00106J-\u0010¡\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u000e2\u0007\u0010\u009f\u0001\u001a\u00020\u00102\u0007\u0010 \u0001\u001a\u00020\u000eH\u0017¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001a\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010£\u0001\u001a\u00020\tH\u0017¢\u0006\u0005\b¤\u0001\u0010\\J\u001a\u0010¦\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\b¦\u0001\u0010<J\u0019\u0010§\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\b§\u0001\u0010\u0018J\u0019\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\b¨\u0001\u0010\u0018J\u001a\u0010ª\u0001\u001a\u00020\u00062\u0007\u0010©\u0001\u001a\u00020\tH\u0017¢\u0006\u0005\bª\u0001\u0010\\J\u0011\u0010«\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b«\u0001\u0010\bJ\u0011\u0010¬\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b¬\u0001\u0010\bJ\u001a\u0010®\u0001\u001a\u00020\u00062\u0007\u0010\u00ad\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b®\u0001\u00106J\u001a\u0010°\u0001\u001a\u00020\u00062\u0007\u0010¯\u0001\u001a\u00020=H\u0017¢\u0006\u0005\b°\u0001\u0010@J\u0019\u0010±\u0001\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\tH\u0017¢\u0006\u0005\b±\u0001\u0010\\J$\u0010´\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u000e2\u0007\u0010³\u0001\u001a\u00020LH\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010¶\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0010H\u0017¢\u0006\u0005\b¶\u0001\u0010<J\u001a\u0010¸\u0001\u001a\u00020\u00062\u0007\u0010·\u0001\u001a\u00020LH\u0017¢\u0006\u0005\b¸\u0001\u0010NJ\u0019\u0010¹\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0010H\u0017¢\u0006\u0005\b¹\u0001\u0010<J\u001a\u0010»\u0001\u001a\u00020\u00062\u0007\u0010º\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b»\u0001\u00106J\u0019\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u000eH\u0017¢\u0006\u0005\b¼\u0001\u00106J\u0019\u0010½\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0010H\u0017¢\u0006\u0005\b½\u0001\u0010<J\u0019\u0010¾\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\b¾\u0001\u0010\u0018J\u0011\u0010¿\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\b¿\u0001\u0010\bJ\u0019\u0010À\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000eH\u0017¢\u0006\u0005\bÀ\u0001\u00106J1\u0010Â\u0001\u001a\u00020\u00062\t\u0010 \u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0005\bÂ\u0001\u00103J8\u0010Å\u0001\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u000e2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J/\u0010Ç\u0001\u001a\u00020\u00062\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÇ\u0001\u00103J!\u0010È\u0001\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÈ\u0001\u0010\u001bJ\"\u0010Ê\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÊ\u0001\u0010\u001bJ\u001a\u0010Ì\u0001\u001a\u00020\u00062\u0007\u0010Ë\u0001\u001a\u00020=H\u0017¢\u0006\u0005\bÌ\u0001\u0010@J#\u0010Î\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0007\u0010Í\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\bÎ\u0001\u0010zJ#\u0010Ð\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0007\u0010Ï\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\bÐ\u0001\u0010zJ#\u0010Ò\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0017¢\u0006\u0005\bÒ\u0001\u0010zJ\u0019\u0010Ó\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÓ\u0001\u0010\u0018J*\u0010Ô\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÔ\u0001\u00103J*\u0010Õ\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÕ\u0001\u00103JV\u0010Ú\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010×\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010Ø\u0001\u001a\u00020=2\u0007\u0010Ë\u0001\u001a\u00020=2\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J9\u0010Ü\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u000e2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010×\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0006\bÜ\u0001\u0010Æ\u0001J&\u0010Ý\u0001\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010\u000e2\b\u0010f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001c\u0010à\u0001\u001a\u00020\u00062\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0005\bà\u0001\u00106J\u0011\u0010á\u0001\u001a\u00020\u0006H\u0017¢\u0006\u0005\bá\u0001\u0010\bJ\u0012\u0010â\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\bâ\u0001\u0010ã\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010ä\u0001¨\u0006ç\u0001"}, d2 = {"Lcom/zohosalesiq/reactlibrary/RNZohoSalesIQMobilisten;", "Lcom/zohosalesiq/reactlibrary/ZohoSalesIQMobilistenSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "initialize", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "attenderId", "", "defaultImage", "Lcom/facebook/react/bridge/Callback;", "imageCallback", "fetchAttenderImage", "(Ljava/lang/String;ZLcom/facebook/react/bridge/Callback;)V", "listCallback", "getChats", "(Lcom/facebook/react/bridge/Callback;)V", ViewProps.FILTER, "getChatsWithFilter", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "departmentCallback", "getDepartments", "fetchDepartments", "(Lcom/facebook/react/bridge/Promise;)V", "getCommunicationMode", "attributesMap", "setAttributes", "callback", "isMultipleOpenChatRestricted", "articlesCallback", "getArticles", "categoryId", "getArticlesWithCategoryID", "categoryCallback", "getCategories", StackTraceHelper.ID_KEY, "openArticle", "appKey", "accessKey", "init", "(Ljava/lang/String;Ljava/lang/String;)V", "initCallback", "initWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "mode", "showLauncher", "(Ljava/lang/String;)V", "listener", "updateListener", "setVisibilityModeToCustomLauncher", ViewProps.ENABLED, "enableDragToDismiss", "(Z)V", "", "duration", "setMinimumPressDuration", "(D)V", "title", "setChatTitle", "onlineTitle", "offlineTitle", "setChatConversationTitle", "hide", "hideQueueTime", EventKeys.ERROR_CODE, "setLanguage", "department", "setDepartment", "Lcom/facebook/react/bridge/ReadableArray;", "setDepartments", "(Lcom/facebook/react/bridge/ReadableArray;)V", "email", "setOperatorEmail", ViewProps.VISIBLE, "showOperatorImageInChat", "setFeedbackVisibility", "setRatingVisibility", "show", "showOperatorImageInLauncher", "openChat", "chatId", "openChatWithID", "result", "showPayloadChat", "(Lcom/facebook/react/bridge/ReadableMap;)V", "showOfflineMessage", "endChat", "setLauncherVisibility", "name", "setVisitorName", "setVisitorEmail", "number", "setVisitorContactNumber", "key", EventKeys.VALUE_KEY, "setVisitorAddInfo", "question", "setQuestion", "startChat", "setConversationVisibility", "dismissUI", "enable", "showFeedbackAfterSkip", "showFeedbackUpToDuration", "seconds", "setChatWaitingTime", "extras", "processNotificationMessage", "map", "isSDKMessage", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "fcmToken", "isTestDevice", "registerPush", "(Ljava/lang/String;Z)V", "getNotificationPayload", "actionSource", "setNotificationActionSource", "tabString", "present", "setConversationListTitle", "setFAQVisibility", "uniqueId", "registerVisitor", "unregisterVisitor", "setPageTitle", "actionName", "setCustomAction", "shouldOpenChatWindow", "performCustomAction", "enableInAppNotification", "disableInAppNotification", "colorCode", "setThemeColorforiOS", "theme", "setThemeColor", "chatComponentName", "visibility", "setChatComponentVisibility", "setVisitorNameVisibility", "enablePreChatForms", "disablePreChatForms", "enableScreenshotOption", "disableScreenshotOption", "registerChatAction", "unregisterChatAction", "unregisterAllChatActions", "timeout", "setChatActionTimeout", "uuid", "completeChatAction", "success", "message", "completeChatActionWithMessage", "(Ljava/lang/String;ZLjava/lang/String;)V", "visitorLocation", "setVisitorLocation", BaseJavaModule.METHOD_TYPE_SYNC, "syncThemeWithOsForAndroid", "isChatEnabled", "getChatUnreadCount", "launcherPropertiesMap", "setLauncherPropertiesForAndroid", "refreshLauncherPropertiesForAndroid", "refreshLauncher", "eventName", "addListener", "count", "removeListeners", "setCustomFont", "event", "objects", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "shouldOpenUrl", "tabNames", "setTabOrder", "printDebugLogsForAndroid", "drawableName", "setNotificationIconForAndroid", "setThemeForAndroid", "setLoggerEnabled", "isLoggerEnabled", "clearLogsForiOS", "setLoggerPathForiOS", "logLevel", "writeLogForiOS", "customChatId", "departmentName", "startNewChat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "startNewChatWithTrigger", "getChat", "type", "isKnowledgeBaseEnabled", "limit", "setKnowledgeBaseRecentlyViewedCount", "shouldShow", "setKnowledgeBaseVisibility", "shouldCategorize", "categorizeKnowledgeBase", "merge", "combineKnowledgeBaseDepartments", "getKnowledgeBaseResourceDepartments", "openKnowledgeBase", "getKnowledgeBaseSingleResource", "departmentID", "parentCategoryID", "page", "searchKey", "getKnowledgeBaseResources", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "getKnowledgeBaseCategories", "updateConfiguration", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "fileName", "registerLocalizationFile", "reRegisterPush", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "a", "react-native-zohosalesiq_mobilisten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNZohoSalesIQMobilisten.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNZohoSalesIQMobilisten.kt\ncom/zohosalesiq/reactlibrary/RNZohoSalesIQMobilisten\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,628:1\n808#2,11:629\n*S KotlinDebug\n*F\n+ 1 RNZohoSalesIQMobilisten.kt\ncom/zohosalesiq/reactlibrary/RNZohoSalesIQMobilisten\n*L\n151#1:629,11\n*E\n"})
/* loaded from: classes4.dex */
public final class RNZohoSalesIQMobilisten extends ZohoSalesIQMobilistenSpec {

    @NotNull
    public static final String NAME = "RNZohoSalesIQMobilisten";

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNZohoSalesIQMobilisten(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Q0(eventName);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void categorizeKnowledgeBase(@NotNull String type, boolean shouldCategorize) {
        Intrinsics.checkNotNullParameter(type, "type");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.R0(type, shouldCategorize);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void clearLogsForiOS() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.T0();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void combineKnowledgeBaseDepartments(@NotNull String type, boolean merge) {
        Intrinsics.checkNotNullParameter(type, "type");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.U0(type, merge);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void completeChatAction(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.W0(uuid);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void completeChatActionWithMessage(@NotNull String uuid, boolean success, @NotNull String message) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(message, "message");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Y0(uuid, success, message);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void disableInAppNotification() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.b1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void disablePreChatForms() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.d1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void disableScreenshotOption() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.f1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void dismissUI() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.h1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void enableDragToDismiss(boolean enabled) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.i1(enabled);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void enableInAppNotification() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.j1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void enablePreChatForms() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.l1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void enableScreenshotOption() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.n1();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void endChat(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.p1(chatId);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void fetchAttenderImage(@NotNull String attenderId, boolean defaultImage, @NotNull Callback imageCallback) {
        Intrinsics.checkNotNullParameter(attenderId, "attenderId");
        Intrinsics.checkNotNullParameter(imageCallback, "imageCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.s1(attenderId, defaultImage, imageCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void fetchDepartments(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.t1(promise);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getArticles(@NotNull Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.z1(articlesCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getArticlesWithCategoryID(@NotNull String categoryId, @NotNull Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.B1(categoryId, articlesCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getCategories(@NotNull Callback categoryCallback) {
        Intrinsics.checkNotNullParameter(categoryCallback, "categoryCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.D1(categoryCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getChat(@NotNull String chatId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.F1(chatId, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getChatUnreadCount(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.H1(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getChats(@NotNull Callback listCallback) {
        Intrinsics.checkNotNullParameter(listCallback, "listCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.J1(listCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getChatsWithFilter(@NotNull String filter, @NotNull Callback listCallback) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(listCallback, "listCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.L1(filter, listCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    public void getCommunicationMode(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.N1(promise);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getDepartments(@NotNull Callback departmentCallback) {
        Intrinsics.checkNotNullParameter(departmentCallback, "departmentCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.R1(departmentCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getKnowledgeBaseCategories(@NotNull String type, @Nullable String departmentID, @Nullable String parentCategoryID, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.V1(type, departmentID, parentCategoryID, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getKnowledgeBaseResourceDepartments(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.X1(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getKnowledgeBaseResources(@NotNull String type, @Nullable String departmentID, @Nullable String parentCategoryID, double page, double limit, @Nullable String searchKey, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Y1(type, departmentID, parentCategoryID, (int) page, (int) limit, searchKey, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getKnowledgeBaseSingleResource(@NotNull String type, @NotNull String id2, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.a2(type, id2, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNZohoSalesIQMobilisten";
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void getNotificationPayload(@NotNull ReadableMap readableMap, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.c2(readableMap, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void hideQueueTime(boolean hide) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.g2(hide);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void init(@NotNull String appKey, @NotNull String accessKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.i2(appKey, accessKey);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void initWithCallback(@NotNull String appKey, @NotNull String accessKey, @NotNull Callback initCallback) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Intrinsics.checkNotNullParameter(initCallback, "initCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.k2(appKey, accessKey, initCallback);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        C0.f44680a.n(this.reactContext);
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void isChatEnabled(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.o2(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void isKnowledgeBaseEnabled(@NotNull String type, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.q2(type, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void isLoggerEnabled(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.s2(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void isMultipleOpenChatRestricted(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.u2(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void isSDKMessage(@NotNull ReadableMap map, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.v2(map, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void openArticle(@NotNull String id2, @NotNull Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.x2(id2, articlesCallback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void openChat() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.z2();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void openChatWithID(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.B2(chatId);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void openKnowledgeBase(@NotNull String type, @NotNull String id2, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.D2(type, id2, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void performCustomAction(@NotNull String actionName, boolean shouldOpenChatWindow) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.F2(actionName, shouldOpenChatWindow);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void present(@Nullable String tabString, @Nullable String id2, @Nullable Callback callback) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.H2(tabString, id2, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void printDebugLogsForAndroid(boolean value) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.K2(value);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void processNotificationMessage(@NotNull ReadableMap extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.L2(extras);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void reRegisterPush() {
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void refreshLauncher() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.N2();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void refreshLauncherPropertiesForAndroid() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.O2();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void registerChatAction(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Q2(actionName);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void registerLocalizationFile(@Nullable String fileName) {
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void registerPush(@NotNull String fcmToken, boolean isTestDevice) {
        Intrinsics.checkNotNullParameter(fcmToken, "fcmToken");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.S2(fcmToken, isTestDevice);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void registerVisitor(@NotNull String uniqueId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.T2(uniqueId, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void removeListeners(double count) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.V2(Integer.valueOf((int) count));
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void sendEvent(@NotNull String event, @NotNull ReadableArray objects) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(objects, "objects");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.W2(event, objects);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setAttributes(@NotNull ReadableMap attributesMap, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(attributesMap, "attributesMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Y2(attributesMap, promise);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setChatActionTimeout(double timeout) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.a3(timeout);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setChatComponentVisibility(@NotNull String chatComponentName, boolean visibility) {
        Intrinsics.checkNotNullParameter(chatComponentName, "chatComponentName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.c3(chatComponentName, visibility);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setChatConversationTitle(@Nullable String onlineTitle, @Nullable String offlineTitle) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.e3(onlineTitle, offlineTitle);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setChatTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.g3(title);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setChatWaitingTime(double seconds) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.i3((int) seconds);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setConversationListTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.j3(title);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setConversationVisibility(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.l3(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setCustomAction(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.n3(actionName);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setCustomFont(@NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.p3(map);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setDepartment(@NotNull String department) {
        Intrinsics.checkNotNullParameter(department, "department");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.q3(department);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setDepartments(@Nullable ReadableArray department) {
        ArrayList arrayList;
        ArrayList<Object> arrayList2;
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            if (department == null || (arrayList2 = department.toArrayList()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
            g10.s3(arrayList);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setFAQVisibility(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.u3(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setFeedbackVisibility(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.w3(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setKnowledgeBaseRecentlyViewedCount(double limit) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.y3((int) limit);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setKnowledgeBaseVisibility(@NotNull String type, boolean shouldShow) {
        Intrinsics.checkNotNullParameter(type, "type");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.z3(type, shouldShow);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setLanguage(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.B3(code);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setLauncherPropertiesForAndroid(@NotNull ReadableMap launcherPropertiesMap) {
        Intrinsics.checkNotNullParameter(launcherPropertiesMap, "launcherPropertiesMap");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.D3(launcherPropertiesMap);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setLauncherVisibility(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.F3(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setLoggerEnabled(boolean value) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.H3(value);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setLoggerPathForiOS(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.I3(value);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setMinimumPressDuration(double duration) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.J3((int) duration);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setNotificationActionSource(@NotNull String actionSource) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.K3(actionSource);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setNotificationIconForAndroid(@NotNull String drawableName) {
        Intrinsics.checkNotNullParameter(drawableName, "drawableName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.L3(drawableName);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setOperatorEmail(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.M3(email);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setPageTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.O3(title);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setQuestion(@NotNull String question) {
        Intrinsics.checkNotNullParameter(question, "question");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Q3(question);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setRatingVisibility(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.S3(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setTabOrder(@NotNull ReadableArray tabNames) {
        Intrinsics.checkNotNullParameter(tabNames, "tabNames");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.U3(tabNames);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setThemeColor(@Nullable ReadableMap theme) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.V3(theme);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setThemeColorforiOS(@NotNull String colorCode) {
        Intrinsics.checkNotNullParameter(colorCode, "colorCode");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.W3(colorCode);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setThemeForAndroid(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.X3(name);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisibilityModeToCustomLauncher(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Y3(mode);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorAddInfo(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.Z3(key, value);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorContactNumber(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.b4(number);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorEmail(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.d4(email);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorLocation(@NotNull ReadableMap visitorLocation) {
        Intrinsics.checkNotNullParameter(visitorLocation, "visitorLocation");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.f4(visitorLocation);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.g4(name);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void setVisitorNameVisibility(boolean visibility) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.i4(visibility);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void shouldOpenUrl(boolean value) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.k4(value);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showFeedbackAfterSkip(boolean enable) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.l4(enable);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showFeedbackUpToDuration(double duration) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.m4((int) duration);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showLauncher(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.n4(mode);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showOfflineMessage(boolean show) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.o4(show);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showOperatorImageInChat(boolean visible) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.q4(visible);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showOperatorImageInLauncher(boolean show) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.s4(show);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void showPayloadChat(@NotNull ReadableMap result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.u4(result);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void startChat(@NotNull String question) {
        Intrinsics.checkNotNullParameter(question, "question");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.w4(question);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void startNewChat(@NotNull String question, @Nullable String customChatId, @Nullable String departmentName, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.y4(question, customChatId, departmentName, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void startNewChatWithTrigger(@Nullable String customChatId, @Nullable String departmentName, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.A4(customChatId, departmentName, callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void syncThemeWithOsForAndroid(boolean sync) {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.C4(sync);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void unregisterAllChatActions() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.E4();
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void unregisterChatAction(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.G4(actionName);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void unregisterVisitor(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.I4(callback);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    public void updateConfiguration(@Nullable String key, @Nullable ReadableMap value) {
        C0 g10;
        if (key == null || (g10 = C0.f44680a.g()) == null) {
            return;
        }
        g10.K4(key, value);
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void updateListener(@NotNull String listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.L4(listener);
        }
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void writeLogForiOS(@Nullable String message, @Nullable String logLevel, @Nullable Callback callback) {
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @ReactMethod
    public void initialize(@NotNull ReadableMap readableMap, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            g10.m2(readableMap, promise);
        }
    }
}
