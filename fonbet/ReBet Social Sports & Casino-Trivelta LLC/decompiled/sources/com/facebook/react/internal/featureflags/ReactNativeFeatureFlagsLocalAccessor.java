package com.facebook.react.internal.featureflags;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\bB\n\u0002\u0010\u0006\n\u0002\bp\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010e\u001a\u00020\nH\u0016J\b\u0010f\u001a\u00020\nH\u0016J\b\u0010g\u001a\u00020\nH\u0016J\b\u0010h\u001a\u00020\nH\u0016J\b\u0010i\u001a\u00020\nH\u0016J\b\u0010j\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020\nH\u0016J\b\u0010l\u001a\u00020\nH\u0016J\b\u0010m\u001a\u00020\nH\u0016J\b\u0010n\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\nH\u0016J\b\u0010p\u001a\u00020\nH\u0016J\b\u0010q\u001a\u00020\nH\u0016J\b\u0010r\u001a\u00020\nH\u0016J\b\u0010s\u001a\u00020\nH\u0016J\b\u0010t\u001a\u00020\nH\u0016J\b\u0010u\u001a\u00020\nH\u0016J\b\u0010v\u001a\u00020\nH\u0016J\b\u0010w\u001a\u00020\nH\u0016J\b\u0010x\u001a\u00020\nH\u0016J\b\u0010y\u001a\u00020\nH\u0016J\b\u0010z\u001a\u00020\nH\u0016J\b\u0010{\u001a\u00020\nH\u0016J\b\u0010|\u001a\u00020\nH\u0016J\b\u0010}\u001a\u00020\nH\u0016J\b\u0010~\u001a\u00020\nH\u0016J\b\u0010\u007f\u001a\u00020\nH\u0016J\t\u0010\u0080\u0001\u001a\u00020\nH\u0016J\t\u0010\u0081\u0001\u001a\u00020\nH\u0016J\t\u0010\u0082\u0001\u001a\u00020\nH\u0016J\t\u0010\u0083\u0001\u001a\u00020\nH\u0016J\t\u0010\u0084\u0001\u001a\u00020\nH\u0016J\t\u0010\u0085\u0001\u001a\u00020\nH\u0016J\t\u0010\u0086\u0001\u001a\u00020\nH\u0016J\t\u0010\u0087\u0001\u001a\u00020\nH\u0016J\t\u0010\u0088\u0001\u001a\u00020\nH\u0016J\t\u0010\u0089\u0001\u001a\u00020\nH\u0016J\t\u0010\u008a\u0001\u001a\u00020\nH\u0016J\t\u0010\u008b\u0001\u001a\u00020\nH\u0016J\t\u0010\u008c\u0001\u001a\u00020\nH\u0016J\t\u0010\u008d\u0001\u001a\u00020\nH\u0016J\t\u0010\u008e\u0001\u001a\u00020\nH\u0016J\t\u0010\u008f\u0001\u001a\u00020\nH\u0016J\t\u0010\u0090\u0001\u001a\u00020\nH\u0016J\t\u0010\u0091\u0001\u001a\u00020\nH\u0016J\t\u0010\u0092\u0001\u001a\u00020\nH\u0016J\t\u0010\u0093\u0001\u001a\u00020\nH\u0016J\t\u0010\u0094\u0001\u001a\u00020\nH\u0016J\t\u0010\u0095\u0001\u001a\u00020\nH\u0016J\t\u0010\u0096\u0001\u001a\u00020\nH\u0016J\t\u0010\u0097\u0001\u001a\u00020\nH\u0016J\t\u0010\u0098\u0001\u001a\u00020\nH\u0016J\t\u0010\u0099\u0001\u001a\u00020\nH\u0016J\t\u0010\u009a\u0001\u001a\u00020\nH\u0016J\t\u0010\u009b\u0001\u001a\u00020\nH\u0016J\t\u0010\u009c\u0001\u001a\u00020\nH\u0016J\t\u0010\u009d\u0001\u001a\u00020\nH\u0016J\t\u0010\u009e\u0001\u001a\u00020\nH\u0016J\t\u0010\u009f\u0001\u001a\u00020\nH\u0016J\t\u0010 \u0001\u001a\u00020\nH\u0016J\t\u0010¡\u0001\u001a\u00020\nH\u0016J\t\u0010¢\u0001\u001a\u00020\nH\u0016J\t\u0010£\u0001\u001a\u00020\nH\u0016J\t\u0010¤\u0001\u001a\u00020\nH\u0016J\t\u0010¥\u0001\u001a\u00020\nH\u0016J\t\u0010¦\u0001\u001a\u00020MH\u0016J\t\u0010§\u0001\u001a\u00020\nH\u0016J\t\u0010¨\u0001\u001a\u00020\nH\u0016J\t\u0010©\u0001\u001a\u00020\nH\u0016J\t\u0010ª\u0001\u001a\u00020\nH\u0016J\t\u0010«\u0001\u001a\u00020\nH\u0016J\t\u0010¬\u0001\u001a\u00020\nH\u0016J\t\u0010\u00ad\u0001\u001a\u00020\nH\u0016J\t\u0010®\u0001\u001a\u00020\nH\u0016J\t\u0010¯\u0001\u001a\u00020\nH\u0016J\t\u0010°\u0001\u001a\u00020\nH\u0016J\t\u0010±\u0001\u001a\u00020\nH\u0016J\t\u0010²\u0001\u001a\u00020\nH\u0016J\t\u0010³\u0001\u001a\u00020\nH\u0016J\t\u0010´\u0001\u001a\u00020\nH\u0016J\t\u0010µ\u0001\u001a\u00020\nH\u0016J\t\u0010¶\u0001\u001a\u00020\nH\u0016J\t\u0010·\u0001\u001a\u00020\nH\u0016J\t\u0010¸\u0001\u001a\u00020\nH\u0016J\t\u0010¹\u0001\u001a\u00020\nH\u0016J\t\u0010º\u0001\u001a\u00020MH\u0016J\t\u0010»\u0001\u001a\u00020MH\u0016J\t\u0010¼\u0001\u001a\u00020MH\u0016J\u0013\u0010½\u0001\u001a\u00030¾\u00012\u0007\u0010¿\u0001\u001a\u00020\u0005H\u0016J\n\u0010À\u0001\u001a\u00030¾\u0001H\u0016J\u0014\u0010Á\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010¿\u0001\u001a\u00020\u0005H\u0016J\u0011\u0010Â\u0001\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0003\bÃ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010 \u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010!\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\"\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010#\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010$\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010&\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010'\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010(\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010*\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010+\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010,\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010-\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010.\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010/\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00100\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00101\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00102\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00103\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00104\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00105\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00106\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00107\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00108\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u00109\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010:\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010;\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010<\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010=\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010>\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010?\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010@\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010A\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010B\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010C\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010D\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010E\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010F\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010G\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010H\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010I\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010J\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010K\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0004\n\u0002\u0010NR\u0012\u0010O\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010P\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010Q\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010R\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010S\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010T\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010U\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010V\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010W\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010X\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010Y\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010Z\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010[\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\\\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010]\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010^\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010_\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010`\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010b\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0004\n\u0002\u0010NR\u0012\u0010c\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0004\n\u0002\u0010NR\u0012\u0010d\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0004\n\u0002\u0010N¨\u0006Ä\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsLocalAccessor;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "<init>", "()V", "currentProvider", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "accessedFeatureFlags", "", "", "commonTestFlagCache", "", "Ljava/lang/Boolean;", "cdpInteractionMetricsEnabledCache", "cxxNativeAnimatedEnabledCache", "disableEarlyViewCommandExecutionCache", "disableImageViewPreallocationAndroidCache", "disableMountItemReorderingAndroidCache", "disableOldAndroidAttachmentMetricsWorkaroundsCache", "disableSubviewClippingAndroidCache", "disableTextLayoutManagerCacheAndroidCache", "disableViewPreallocationAndroidCache", "enableAccessibilityOrderCache", "enableAccumulatedUpdatesInRawPropsAndroidCache", "enableAndroidAntialiasedBorderRadiusClippingCache", "enableAndroidLinearTextCache", "enableAndroidTextMeasurementOptimizationsCache", "enableBridgelessArchitectureCache", "enableCppPropsIteratorSetterCache", "enableCustomFocusSearchOnClippedElementsAndroidCache", "enableDestroyShadowTreeRevisionAsyncCache", "enableDoubleMeasurementFixAndroidCache", "enableEagerMainQueueModulesOnIOSCache", "enableEagerRootViewAttachmentCache", "enableExclusivePropsUpdateAndroidCache", "enableFabricLogsCache", "enableFabricRendererCache", "enableFontScaleChangesUpdatingLayoutCache", "enableIOSTextBaselineOffsetPerLineCache", "enableIOSViewClipToPaddingBoxCache", "enableImagePrefetchingAndroidCache", "enableImagePrefetchingJNIBatchingAndroidCache", "enableImagePrefetchingOnUiThreadAndroidCache", "enableImmediateUpdateModeForContentOffsetChangesCache", "enableImperativeFocusCache", "enableInteropViewManagerClassLookUpOptimizationIOSCache", "enableIntersectionObserverByDefaultCache", "enableKeyEventsCache", "enableLayoutAnimationsOnAndroidCache", "enableLayoutAnimationsOnIOSCache", "enableMainQueueCoordinatorOnIOSCache", "enableModuleArgumentNSNullConversionIOSCache", "enableNativeCSSParsingCache", "enableNetworkEventReportingCache", "enablePreparedTextLayoutCache", "enablePropsUpdateReconciliationAndroidCache", "enableSwiftUIBasedFiltersCache", "enableViewCullingCache", "enableViewRecyclingCache", "enableViewRecyclingForImageCache", "enableViewRecyclingForScrollViewCache", "enableViewRecyclingForTextCache", "enableViewRecyclingForViewCache", "enableVirtualViewContainerStateExperimentalCache", "enableVirtualViewDebugFeaturesCache", "enableVirtualViewRenderStateCache", "enableVirtualViewWindowFocusDetectionCache", "enableWebPerformanceAPIsByDefaultCache", "fixMappingOfEventPrioritiesBetweenFabricAndReactCache", "fixTextClippingAndroid15useBoundsForWidthCache", "fuseboxAssertSingleHostStateCache", "fuseboxEnabledReleaseCache", "fuseboxNetworkInspectionEnabledCache", "hideOffscreenVirtualViewsOnIOSCache", "overrideBySynchronousMountPropsAtMountingAndroidCache", "perfIssuesEnabledCache", "perfMonitorV2EnabledCache", "preparedTextCacheSizeCache", "", "Ljava/lang/Double;", "preventShadowTreeCommitExhaustionCache", "shouldPressibilityUseW3CPointerEventsForHoverCache", "shouldResetClickableWhenRecyclingViewCache", "shouldResetOnClickListenerWhenRecyclingViewCache", "shouldSetEnabledBasedOnAccessibilityStateCache", "shouldSetIsClickableByDefaultCache", "shouldTriggerResponderTransferOnScrollAndroidCache", "skipActivityIdentityAssertionOnHostPauseCache", "traceTurboModulePromiseRejectionsOnAndroidCache", "updateRuntimeShadowNodeReferencesOnCommitCache", "useAlwaysAvailableJSErrorHandlingCache", "useFabricInteropCache", "useNativeViewConfigsInBridgelessModeCache", "useRawPropsJsiValueCache", "useShadowNodeStateOnCloneCache", "useSharedAnimatedBackendCache", "useTraitHiddenOnAndroidCache", "useTurboModuleInteropCache", "useTurboModulesCache", "viewCullingOutsetRatioCache", "virtualViewHysteresisRatioCache", "virtualViewPrerenderRatioCache", "commonTestFlag", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "disableEarlyViewCommandExecution", "disableImageViewPreallocationAndroid", "disableMountItemReorderingAndroid", "disableOldAndroidAttachmentMetricsWorkarounds", "disableSubviewClippingAndroid", "disableTextLayoutManagerCacheAndroid", "disableViewPreallocationAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidAntialiasedBorderRadiusClipping", "enableAndroidLinearText", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableExclusivePropsUpdateAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImagePrefetchingJNIBatchingAndroid", "enableImagePrefetchingOnUiThreadAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "enableWebPerformanceAPIsByDefault", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixTextClippingAndroid15useBoundsForWidth", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", "preparedTextCacheSize", "preventShadowTreeCommitExhaustion", "shouldPressibilityUseW3CPointerEventsForHover", "shouldResetClickableWhenRecyclingView", "shouldResetOnClickListenerWhenRecyclingView", "shouldSetEnabledBasedOnAccessibilityState", "shouldSetIsClickableByDefault", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeViewConfigsInBridgelessMode", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useSharedAnimatedBackend", "useTraitHiddenOnAndroid", "useTurboModuleInterop", "useTurboModules", "viewCullingOutsetRatio", "virtualViewHysteresisRatio", "virtualViewPrerenderRatio", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "getAccessedFeatureFlags", "getAccessedFeatureFlags$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactNativeFeatureFlagsLocalAccessor implements ReactNativeFeatureFlagsAccessor {

    @Nullable
    private Boolean cdpInteractionMetricsEnabledCache;

    @Nullable
    private Boolean commonTestFlagCache;

    @Nullable
    private Boolean cxxNativeAnimatedEnabledCache;

    @Nullable
    private Boolean disableEarlyViewCommandExecutionCache;

    @Nullable
    private Boolean disableImageViewPreallocationAndroidCache;

    @Nullable
    private Boolean disableMountItemReorderingAndroidCache;

    @Nullable
    private Boolean disableOldAndroidAttachmentMetricsWorkaroundsCache;

    @Nullable
    private Boolean disableSubviewClippingAndroidCache;

    @Nullable
    private Boolean disableTextLayoutManagerCacheAndroidCache;

    @Nullable
    private Boolean disableViewPreallocationAndroidCache;

    @Nullable
    private Boolean enableAccessibilityOrderCache;

    @Nullable
    private Boolean enableAccumulatedUpdatesInRawPropsAndroidCache;

    @Nullable
    private Boolean enableAndroidAntialiasedBorderRadiusClippingCache;

    @Nullable
    private Boolean enableAndroidLinearTextCache;

    @Nullable
    private Boolean enableAndroidTextMeasurementOptimizationsCache;

    @Nullable
    private Boolean enableBridgelessArchitectureCache;

    @Nullable
    private Boolean enableCppPropsIteratorSetterCache;

    @Nullable
    private Boolean enableCustomFocusSearchOnClippedElementsAndroidCache;

    @Nullable
    private Boolean enableDestroyShadowTreeRevisionAsyncCache;

    @Nullable
    private Boolean enableDoubleMeasurementFixAndroidCache;

    @Nullable
    private Boolean enableEagerMainQueueModulesOnIOSCache;

    @Nullable
    private Boolean enableEagerRootViewAttachmentCache;

    @Nullable
    private Boolean enableExclusivePropsUpdateAndroidCache;

    @Nullable
    private Boolean enableFabricLogsCache;

    @Nullable
    private Boolean enableFabricRendererCache;

    @Nullable
    private Boolean enableFontScaleChangesUpdatingLayoutCache;

    @Nullable
    private Boolean enableIOSTextBaselineOffsetPerLineCache;

    @Nullable
    private Boolean enableIOSViewClipToPaddingBoxCache;

    @Nullable
    private Boolean enableImagePrefetchingAndroidCache;

    @Nullable
    private Boolean enableImagePrefetchingJNIBatchingAndroidCache;

    @Nullable
    private Boolean enableImagePrefetchingOnUiThreadAndroidCache;

    @Nullable
    private Boolean enableImmediateUpdateModeForContentOffsetChangesCache;

    @Nullable
    private Boolean enableImperativeFocusCache;

    @Nullable
    private Boolean enableInteropViewManagerClassLookUpOptimizationIOSCache;

    @Nullable
    private Boolean enableIntersectionObserverByDefaultCache;

    @Nullable
    private Boolean enableKeyEventsCache;

    @Nullable
    private Boolean enableLayoutAnimationsOnAndroidCache;

    @Nullable
    private Boolean enableLayoutAnimationsOnIOSCache;

    @Nullable
    private Boolean enableMainQueueCoordinatorOnIOSCache;

    @Nullable
    private Boolean enableModuleArgumentNSNullConversionIOSCache;

    @Nullable
    private Boolean enableNativeCSSParsingCache;

    @Nullable
    private Boolean enableNetworkEventReportingCache;

    @Nullable
    private Boolean enablePreparedTextLayoutCache;

    @Nullable
    private Boolean enablePropsUpdateReconciliationAndroidCache;

    @Nullable
    private Boolean enableSwiftUIBasedFiltersCache;

    @Nullable
    private Boolean enableViewCullingCache;

    @Nullable
    private Boolean enableViewRecyclingCache;

    @Nullable
    private Boolean enableViewRecyclingForImageCache;

    @Nullable
    private Boolean enableViewRecyclingForScrollViewCache;

    @Nullable
    private Boolean enableViewRecyclingForTextCache;

    @Nullable
    private Boolean enableViewRecyclingForViewCache;

    @Nullable
    private Boolean enableVirtualViewContainerStateExperimentalCache;

    @Nullable
    private Boolean enableVirtualViewDebugFeaturesCache;

    @Nullable
    private Boolean enableVirtualViewRenderStateCache;

    @Nullable
    private Boolean enableVirtualViewWindowFocusDetectionCache;

    @Nullable
    private Boolean enableWebPerformanceAPIsByDefaultCache;

    @Nullable
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;

    @Nullable
    private Boolean fixTextClippingAndroid15useBoundsForWidthCache;

    @Nullable
    private Boolean fuseboxAssertSingleHostStateCache;

    @Nullable
    private Boolean fuseboxEnabledReleaseCache;

    @Nullable
    private Boolean fuseboxNetworkInspectionEnabledCache;

    @Nullable
    private Boolean hideOffscreenVirtualViewsOnIOSCache;

    @Nullable
    private Boolean overrideBySynchronousMountPropsAtMountingAndroidCache;

    @Nullable
    private Boolean perfIssuesEnabledCache;

    @Nullable
    private Boolean perfMonitorV2EnabledCache;

    @Nullable
    private Double preparedTextCacheSizeCache;

    @Nullable
    private Boolean preventShadowTreeCommitExhaustionCache;

    @Nullable
    private Boolean shouldPressibilityUseW3CPointerEventsForHoverCache;

    @Nullable
    private Boolean shouldResetClickableWhenRecyclingViewCache;

    @Nullable
    private Boolean shouldResetOnClickListenerWhenRecyclingViewCache;

    @Nullable
    private Boolean shouldSetEnabledBasedOnAccessibilityStateCache;

    @Nullable
    private Boolean shouldSetIsClickableByDefaultCache;

    @Nullable
    private Boolean shouldTriggerResponderTransferOnScrollAndroidCache;

    @Nullable
    private Boolean skipActivityIdentityAssertionOnHostPauseCache;

    @Nullable
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;

    @Nullable
    private Boolean updateRuntimeShadowNodeReferencesOnCommitCache;

    @Nullable
    private Boolean useAlwaysAvailableJSErrorHandlingCache;

    @Nullable
    private Boolean useFabricInteropCache;

    @Nullable
    private Boolean useNativeViewConfigsInBridgelessModeCache;

    @Nullable
    private Boolean useRawPropsJsiValueCache;

    @Nullable
    private Boolean useShadowNodeStateOnCloneCache;

    @Nullable
    private Boolean useSharedAnimatedBackendCache;

    @Nullable
    private Boolean useTraitHiddenOnAndroidCache;

    @Nullable
    private Boolean useTurboModuleInteropCache;

    @Nullable
    private Boolean useTurboModulesCache;

    @Nullable
    private Double viewCullingOutsetRatioCache;

    @Nullable
    private Double virtualViewHysteresisRatioCache;

    @Nullable
    private Double virtualViewPrerenderRatioCache;

    @NotNull
    private ReactNativeFeatureFlagsProvider currentProvider = new ReactNativeFeatureFlagsDefaults();

    @NotNull
    private final Set<String> accessedFeatureFlags = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAccessedFeatureFlags$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence override$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cdpInteractionMetricsEnabled() {
        Boolean bool = this.cdpInteractionMetricsEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.cdpInteractionMetricsEnabled());
            this.accessedFeatureFlags.add("cdpInteractionMetricsEnabled");
            this.cdpInteractionMetricsEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean bool = this.commonTestFlagCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.commonTestFlag());
            this.accessedFeatureFlags.add("commonTestFlag");
            this.commonTestFlagCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedEnabled() {
        Boolean bool = this.cxxNativeAnimatedEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.cxxNativeAnimatedEnabled());
            this.accessedFeatureFlags.add("cxxNativeAnimatedEnabled");
            this.cxxNativeAnimatedEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    @Nullable
    public String dangerouslyForceOverride(@NotNull ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        String accessedFeatureFlags$ReactAndroid_release = getAccessedFeatureFlags$ReactAndroid_release();
        this.currentProvider = provider;
        return accessedFeatureFlags$ReactAndroid_release;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableEarlyViewCommandExecution() {
        Boolean bool = this.disableEarlyViewCommandExecutionCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableEarlyViewCommandExecution());
            this.accessedFeatureFlags.add("disableEarlyViewCommandExecution");
            this.disableEarlyViewCommandExecutionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableImageViewPreallocationAndroid() {
        Boolean bool = this.disableImageViewPreallocationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableImageViewPreallocationAndroid());
            this.accessedFeatureFlags.add("disableImageViewPreallocationAndroid");
            this.disableImageViewPreallocationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean bool = this.disableMountItemReorderingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableMountItemReorderingAndroid());
            this.accessedFeatureFlags.add("disableMountItemReorderingAndroid");
            this.disableMountItemReorderingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableOldAndroidAttachmentMetricsWorkarounds() {
        Boolean bool = this.disableOldAndroidAttachmentMetricsWorkaroundsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableOldAndroidAttachmentMetricsWorkarounds());
            this.accessedFeatureFlags.add("disableOldAndroidAttachmentMetricsWorkarounds");
            this.disableOldAndroidAttachmentMetricsWorkaroundsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableSubviewClippingAndroid() {
        Boolean bool = this.disableSubviewClippingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableSubviewClippingAndroid());
            this.accessedFeatureFlags.add("disableSubviewClippingAndroid");
            this.disableSubviewClippingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableTextLayoutManagerCacheAndroid() {
        Boolean bool = this.disableTextLayoutManagerCacheAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableTextLayoutManagerCacheAndroid());
            this.accessedFeatureFlags.add("disableTextLayoutManagerCacheAndroid");
            this.disableTextLayoutManagerCacheAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableViewPreallocationAndroid() {
        Boolean bool = this.disableViewPreallocationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.disableViewPreallocationAndroid());
            this.accessedFeatureFlags.add("disableViewPreallocationAndroid");
            this.disableViewPreallocationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccessibilityOrder() {
        Boolean bool = this.enableAccessibilityOrderCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAccessibilityOrder());
            this.accessedFeatureFlags.add("enableAccessibilityOrder");
            this.enableAccessibilityOrderCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean bool = this.enableAccumulatedUpdatesInRawPropsAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAccumulatedUpdatesInRawPropsAndroid());
            this.accessedFeatureFlags.add("enableAccumulatedUpdatesInRawPropsAndroid");
            this.enableAccumulatedUpdatesInRawPropsAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidAntialiasedBorderRadiusClipping() {
        Boolean bool = this.enableAndroidAntialiasedBorderRadiusClippingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAndroidAntialiasedBorderRadiusClipping());
            this.accessedFeatureFlags.add("enableAndroidAntialiasedBorderRadiusClipping");
            this.enableAndroidAntialiasedBorderRadiusClippingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidLinearText() {
        Boolean bool = this.enableAndroidLinearTextCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAndroidLinearText());
            this.accessedFeatureFlags.add("enableAndroidLinearText");
            this.enableAndroidLinearTextCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidTextMeasurementOptimizations() {
        Boolean bool = this.enableAndroidTextMeasurementOptimizationsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableAndroidTextMeasurementOptimizations());
            this.accessedFeatureFlags.add("enableAndroidTextMeasurementOptimizations");
            this.enableAndroidTextMeasurementOptimizationsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    /* renamed from: enableBridgelessArchitecture */
    public boolean getNewArchitectureEnabled() {
        Boolean bool = this.enableBridgelessArchitectureCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.getNewArchitectureEnabled());
            this.accessedFeatureFlags.add("enableBridgelessArchitecture");
            this.enableBridgelessArchitectureCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean bool = this.enableCppPropsIteratorSetterCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableCppPropsIteratorSetter());
            this.accessedFeatureFlags.add("enableCppPropsIteratorSetter");
            this.enableCppPropsIteratorSetterCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        Boolean bool = this.enableCustomFocusSearchOnClippedElementsAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableCustomFocusSearchOnClippedElementsAndroid());
            this.accessedFeatureFlags.add("enableCustomFocusSearchOnClippedElementsAndroid");
            this.enableCustomFocusSearchOnClippedElementsAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDestroyShadowTreeRevisionAsync() {
        Boolean bool = this.enableDestroyShadowTreeRevisionAsyncCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableDestroyShadowTreeRevisionAsync());
            this.accessedFeatureFlags.add("enableDestroyShadowTreeRevisionAsync");
            this.enableDestroyShadowTreeRevisionAsyncCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDoubleMeasurementFixAndroid() {
        Boolean bool = this.enableDoubleMeasurementFixAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableDoubleMeasurementFixAndroid());
            this.accessedFeatureFlags.add("enableDoubleMeasurementFixAndroid");
            this.enableDoubleMeasurementFixAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerMainQueueModulesOnIOS() {
        Boolean bool = this.enableEagerMainQueueModulesOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableEagerMainQueueModulesOnIOS());
            this.accessedFeatureFlags.add("enableEagerMainQueueModulesOnIOS");
            this.enableEagerMainQueueModulesOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean bool = this.enableEagerRootViewAttachmentCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableEagerRootViewAttachment());
            this.accessedFeatureFlags.add("enableEagerRootViewAttachment");
            this.enableEagerRootViewAttachmentCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableExclusivePropsUpdateAndroid() {
        Boolean bool = this.enableExclusivePropsUpdateAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableExclusivePropsUpdateAndroid());
            this.accessedFeatureFlags.add("enableExclusivePropsUpdateAndroid");
            this.enableExclusivePropsUpdateAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean bool = this.enableFabricLogsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFabricLogs());
            this.accessedFeatureFlags.add("enableFabricLogs");
            this.enableFabricLogsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean bool = this.enableFabricRendererCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFabricRenderer());
            this.accessedFeatureFlags.add("enableFabricRenderer");
            this.enableFabricRendererCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFontScaleChangesUpdatingLayout() {
        Boolean bool = this.enableFontScaleChangesUpdatingLayoutCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableFontScaleChangesUpdatingLayout());
            this.accessedFeatureFlags.add("enableFontScaleChangesUpdatingLayout");
            this.enableFontScaleChangesUpdatingLayoutCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSTextBaselineOffsetPerLine() {
        Boolean bool = this.enableIOSTextBaselineOffsetPerLineCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableIOSTextBaselineOffsetPerLine());
            this.accessedFeatureFlags.add("enableIOSTextBaselineOffsetPerLine");
            this.enableIOSTextBaselineOffsetPerLineCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean bool = this.enableIOSViewClipToPaddingBoxCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableIOSViewClipToPaddingBox());
            this.accessedFeatureFlags.add("enableIOSViewClipToPaddingBox");
            this.enableIOSViewClipToPaddingBoxCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean bool = this.enableImagePrefetchingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImagePrefetchingAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingAndroid");
            this.enableImagePrefetchingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingJNIBatchingAndroid() {
        Boolean bool = this.enableImagePrefetchingJNIBatchingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImagePrefetchingJNIBatchingAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingJNIBatchingAndroid");
            this.enableImagePrefetchingJNIBatchingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingOnUiThreadAndroid() {
        Boolean bool = this.enableImagePrefetchingOnUiThreadAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImagePrefetchingOnUiThreadAndroid());
            this.accessedFeatureFlags.add("enableImagePrefetchingOnUiThreadAndroid");
            this.enableImagePrefetchingOnUiThreadAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImmediateUpdateModeForContentOffsetChanges() {
        Boolean bool = this.enableImmediateUpdateModeForContentOffsetChangesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImmediateUpdateModeForContentOffsetChanges());
            this.accessedFeatureFlags.add("enableImmediateUpdateModeForContentOffsetChanges");
            this.enableImmediateUpdateModeForContentOffsetChangesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImperativeFocus() {
        Boolean bool = this.enableImperativeFocusCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableImperativeFocus());
            this.accessedFeatureFlags.add("enableImperativeFocus");
            this.enableImperativeFocusCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        Boolean bool = this.enableInteropViewManagerClassLookUpOptimizationIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableInteropViewManagerClassLookUpOptimizationIOS());
            this.accessedFeatureFlags.add("enableInteropViewManagerClassLookUpOptimizationIOS");
            this.enableInteropViewManagerClassLookUpOptimizationIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIntersectionObserverByDefault() {
        Boolean bool = this.enableIntersectionObserverByDefaultCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableIntersectionObserverByDefault());
            this.accessedFeatureFlags.add("enableIntersectionObserverByDefault");
            this.enableIntersectionObserverByDefaultCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableKeyEvents() {
        Boolean bool = this.enableKeyEventsCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableKeyEvents());
            this.accessedFeatureFlags.add("enableKeyEvents");
            this.enableKeyEventsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean bool = this.enableLayoutAnimationsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnAndroid());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnAndroid");
            this.enableLayoutAnimationsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean bool = this.enableLayoutAnimationsOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnIOS());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnIOS");
            this.enableLayoutAnimationsOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMainQueueCoordinatorOnIOS() {
        Boolean bool = this.enableMainQueueCoordinatorOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableMainQueueCoordinatorOnIOS());
            this.accessedFeatureFlags.add("enableMainQueueCoordinatorOnIOS");
            this.enableMainQueueCoordinatorOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableModuleArgumentNSNullConversionIOS() {
        Boolean bool = this.enableModuleArgumentNSNullConversionIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableModuleArgumentNSNullConversionIOS());
            this.accessedFeatureFlags.add("enableModuleArgumentNSNullConversionIOS");
            this.enableModuleArgumentNSNullConversionIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        Boolean bool = this.enableNativeCSSParsingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableNativeCSSParsing());
            this.accessedFeatureFlags.add("enableNativeCSSParsing");
            this.enableNativeCSSParsingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNetworkEventReporting() {
        Boolean bool = this.enableNetworkEventReportingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableNetworkEventReporting());
            this.accessedFeatureFlags.add("enableNetworkEventReporting");
            this.enableNetworkEventReportingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreparedTextLayout() {
        Boolean bool = this.enablePreparedTextLayoutCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enablePreparedTextLayout());
            this.accessedFeatureFlags.add("enablePreparedTextLayout");
            this.enablePreparedTextLayoutCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean bool = this.enablePropsUpdateReconciliationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enablePropsUpdateReconciliationAndroid());
            this.accessedFeatureFlags.add("enablePropsUpdateReconciliationAndroid");
            this.enablePropsUpdateReconciliationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSwiftUIBasedFilters() {
        Boolean bool = this.enableSwiftUIBasedFiltersCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableSwiftUIBasedFilters());
            this.accessedFeatureFlags.add("enableSwiftUIBasedFilters");
            this.enableSwiftUIBasedFiltersCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        Boolean bool = this.enableViewCullingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewCulling());
            this.accessedFeatureFlags.add("enableViewCulling");
            this.enableViewCullingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean bool = this.enableViewRecyclingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecycling());
            this.accessedFeatureFlags.add("enableViewRecycling");
            this.enableViewRecyclingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForImage() {
        Boolean bool = this.enableViewRecyclingForImageCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecyclingForImage());
            this.accessedFeatureFlags.add("enableViewRecyclingForImage");
            this.enableViewRecyclingForImageCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForScrollView() {
        Boolean bool = this.enableViewRecyclingForScrollViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecyclingForScrollView());
            this.accessedFeatureFlags.add("enableViewRecyclingForScrollView");
            this.enableViewRecyclingForScrollViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        Boolean bool = this.enableViewRecyclingForTextCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecyclingForText());
            this.accessedFeatureFlags.add("enableViewRecyclingForText");
            this.enableViewRecyclingForTextCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        Boolean bool = this.enableViewRecyclingForViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableViewRecyclingForView());
            this.accessedFeatureFlags.add("enableViewRecyclingForView");
            this.enableViewRecyclingForViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewContainerStateExperimental() {
        Boolean bool = this.enableVirtualViewContainerStateExperimentalCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableVirtualViewContainerStateExperimental());
            this.accessedFeatureFlags.add("enableVirtualViewContainerStateExperimental");
            this.enableVirtualViewContainerStateExperimentalCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewDebugFeatures() {
        Boolean bool = this.enableVirtualViewDebugFeaturesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableVirtualViewDebugFeatures());
            this.accessedFeatureFlags.add("enableVirtualViewDebugFeatures");
            this.enableVirtualViewDebugFeaturesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewRenderState() {
        Boolean bool = this.enableVirtualViewRenderStateCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableVirtualViewRenderState());
            this.accessedFeatureFlags.add("enableVirtualViewRenderState");
            this.enableVirtualViewRenderStateCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewWindowFocusDetection() {
        Boolean bool = this.enableVirtualViewWindowFocusDetectionCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableVirtualViewWindowFocusDetection());
            this.accessedFeatureFlags.add("enableVirtualViewWindowFocusDetection");
            this.enableVirtualViewWindowFocusDetectionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableWebPerformanceAPIsByDefault() {
        Boolean bool = this.enableWebPerformanceAPIsByDefaultCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.enableWebPerformanceAPIsByDefault());
            this.accessedFeatureFlags.add("enableWebPerformanceAPIsByDefault");
            this.enableWebPerformanceAPIsByDefaultCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean bool = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.accessedFeatureFlags.add("fixMappingOfEventPrioritiesBetweenFabricAndReact");
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixTextClippingAndroid15useBoundsForWidth() {
        Boolean bool = this.fixTextClippingAndroid15useBoundsForWidthCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fixTextClippingAndroid15useBoundsForWidth());
            this.accessedFeatureFlags.add("fixTextClippingAndroid15useBoundsForWidth");
            this.fixTextClippingAndroid15useBoundsForWidthCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxAssertSingleHostState() {
        Boolean bool = this.fuseboxAssertSingleHostStateCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fuseboxAssertSingleHostState());
            this.accessedFeatureFlags.add("fuseboxAssertSingleHostState");
            this.fuseboxAssertSingleHostStateCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean bool = this.fuseboxEnabledReleaseCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fuseboxEnabledRelease());
            this.accessedFeatureFlags.add("fuseboxEnabledRelease");
            this.fuseboxEnabledReleaseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        Boolean bool = this.fuseboxNetworkInspectionEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.fuseboxNetworkInspectionEnabled());
            this.accessedFeatureFlags.add("fuseboxNetworkInspectionEnabled");
            this.fuseboxNetworkInspectionEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Nullable
    public final String getAccessedFeatureFlags$ReactAndroid_release() {
        if (this.accessedFeatureFlags.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: j8.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence accessedFeatureFlags$lambda$1;
                accessedFeatureFlags$lambda$1 = ReactNativeFeatureFlagsLocalAccessor.getAccessedFeatureFlags$lambda$1((String) obj);
                return accessedFeatureFlags$lambda$1;
            }
        }, 30, null);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean hideOffscreenVirtualViewsOnIOS() {
        Boolean bool = this.hideOffscreenVirtualViewsOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.hideOffscreenVirtualViewsOnIOS());
            this.accessedFeatureFlags.add("hideOffscreenVirtualViewsOnIOS");
            this.hideOffscreenVirtualViewsOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(@NotNull ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.accessedFeatureFlags.isEmpty()) {
            this.currentProvider = provider;
            return;
        }
        throw new IllegalStateException("Feature flags were accessed before being overridden: " + CollectionsKt.joinToString$default(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1() { // from class: j8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence override$lambda$0;
                override$lambda$0 = ReactNativeFeatureFlagsLocalAccessor.override$lambda$0((String) obj);
                return override$lambda$0;
            }
        }, 30, null));
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean overrideBySynchronousMountPropsAtMountingAndroid() {
        Boolean bool = this.overrideBySynchronousMountPropsAtMountingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.overrideBySynchronousMountPropsAtMountingAndroid());
            this.accessedFeatureFlags.add("overrideBySynchronousMountPropsAtMountingAndroid");
            this.overrideBySynchronousMountPropsAtMountingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfIssuesEnabled() {
        Boolean bool = this.perfIssuesEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.perfIssuesEnabled());
            this.accessedFeatureFlags.add("perfIssuesEnabled");
            this.perfIssuesEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfMonitorV2Enabled() {
        Boolean bool = this.perfMonitorV2EnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.perfMonitorV2Enabled());
            this.accessedFeatureFlags.add("perfMonitorV2Enabled");
            this.perfMonitorV2EnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double preparedTextCacheSize() {
        Double d10 = this.preparedTextCacheSizeCache;
        if (d10 == null) {
            d10 = Double.valueOf(this.currentProvider.preparedTextCacheSize());
            this.accessedFeatureFlags.add("preparedTextCacheSize");
            this.preparedTextCacheSizeCache = d10;
        }
        return d10.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventShadowTreeCommitExhaustion() {
        Boolean bool = this.preventShadowTreeCommitExhaustionCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.preventShadowTreeCommitExhaustion());
            this.accessedFeatureFlags.add("preventShadowTreeCommitExhaustion");
            this.preventShadowTreeCommitExhaustionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldPressibilityUseW3CPointerEventsForHover() {
        Boolean bool = this.shouldPressibilityUseW3CPointerEventsForHoverCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldPressibilityUseW3CPointerEventsForHover());
            this.accessedFeatureFlags.add("shouldPressibilityUseW3CPointerEventsForHover");
            this.shouldPressibilityUseW3CPointerEventsForHoverCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldResetClickableWhenRecyclingView() {
        Boolean bool = this.shouldResetClickableWhenRecyclingViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldResetClickableWhenRecyclingView());
            this.accessedFeatureFlags.add("shouldResetClickableWhenRecyclingView");
            this.shouldResetClickableWhenRecyclingViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldResetOnClickListenerWhenRecyclingView() {
        Boolean bool = this.shouldResetOnClickListenerWhenRecyclingViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldResetOnClickListenerWhenRecyclingView());
            this.accessedFeatureFlags.add("shouldResetOnClickListenerWhenRecyclingView");
            this.shouldResetOnClickListenerWhenRecyclingViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldSetEnabledBasedOnAccessibilityState() {
        Boolean bool = this.shouldSetEnabledBasedOnAccessibilityStateCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldSetEnabledBasedOnAccessibilityState());
            this.accessedFeatureFlags.add("shouldSetEnabledBasedOnAccessibilityState");
            this.shouldSetEnabledBasedOnAccessibilityStateCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldSetIsClickableByDefault() {
        Boolean bool = this.shouldSetIsClickableByDefaultCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldSetIsClickableByDefault());
            this.accessedFeatureFlags.add("shouldSetIsClickableByDefault");
            this.shouldSetIsClickableByDefaultCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldTriggerResponderTransferOnScrollAndroid() {
        Boolean bool = this.shouldTriggerResponderTransferOnScrollAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.shouldTriggerResponderTransferOnScrollAndroid());
            this.accessedFeatureFlags.add("shouldTriggerResponderTransferOnScrollAndroid");
            this.shouldTriggerResponderTransferOnScrollAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean skipActivityIdentityAssertionOnHostPause() {
        Boolean bool = this.skipActivityIdentityAssertionOnHostPauseCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.skipActivityIdentityAssertionOnHostPause());
            this.accessedFeatureFlags.add("skipActivityIdentityAssertionOnHostPause");
            this.skipActivityIdentityAssertionOnHostPauseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean bool = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.traceTurboModulePromiseRejectionsOnAndroid());
            this.accessedFeatureFlags.add("traceTurboModulePromiseRejectionsOnAndroid");
            this.traceTurboModulePromiseRejectionsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommit() {
        Boolean bool = this.updateRuntimeShadowNodeReferencesOnCommitCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.updateRuntimeShadowNodeReferencesOnCommit());
            this.accessedFeatureFlags.add("updateRuntimeShadowNodeReferencesOnCommit");
            this.updateRuntimeShadowNodeReferencesOnCommitCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean bool = this.useAlwaysAvailableJSErrorHandlingCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useAlwaysAvailableJSErrorHandling());
            this.accessedFeatureFlags.add("useAlwaysAvailableJSErrorHandling");
            this.useAlwaysAvailableJSErrorHandlingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean bool = this.useFabricInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useFabricInterop());
            this.accessedFeatureFlags.add("useFabricInterop");
            this.useFabricInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean bool = this.useNativeViewConfigsInBridgelessModeCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useNativeViewConfigsInBridgelessMode());
            this.accessedFeatureFlags.add("useNativeViewConfigsInBridgelessMode");
            this.useNativeViewConfigsInBridgelessModeCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        Boolean bool = this.useRawPropsJsiValueCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useRawPropsJsiValue());
            this.accessedFeatureFlags.add("useRawPropsJsiValue");
            this.useRawPropsJsiValueCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useShadowNodeStateOnClone() {
        Boolean bool = this.useShadowNodeStateOnCloneCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useShadowNodeStateOnClone());
            this.accessedFeatureFlags.add("useShadowNodeStateOnClone");
            this.useShadowNodeStateOnCloneCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useSharedAnimatedBackend() {
        Boolean bool = this.useSharedAnimatedBackendCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useSharedAnimatedBackend());
            this.accessedFeatureFlags.add("useSharedAnimatedBackend");
            this.useSharedAnimatedBackendCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTraitHiddenOnAndroid() {
        Boolean bool = this.useTraitHiddenOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useTraitHiddenOnAndroid());
            this.accessedFeatureFlags.add("useTraitHiddenOnAndroid");
            this.useTraitHiddenOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean bool = this.useTurboModuleInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useTurboModuleInterop());
            this.accessedFeatureFlags.add("useTurboModuleInterop");
            this.useTurboModuleInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean bool = this.useTurboModulesCache;
        if (bool == null) {
            bool = Boolean.valueOf(this.currentProvider.useTurboModules());
            this.accessedFeatureFlags.add("useTurboModules");
            this.useTurboModulesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double viewCullingOutsetRatio() {
        Double d10 = this.viewCullingOutsetRatioCache;
        if (d10 == null) {
            d10 = Double.valueOf(this.currentProvider.viewCullingOutsetRatio());
            this.accessedFeatureFlags.add("viewCullingOutsetRatio");
            this.viewCullingOutsetRatioCache = d10;
        }
        return d10.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewHysteresisRatio() {
        Double d10 = this.virtualViewHysteresisRatioCache;
        if (d10 == null) {
            d10 = Double.valueOf(this.currentProvider.virtualViewHysteresisRatio());
            this.accessedFeatureFlags.add("virtualViewHysteresisRatio");
            this.virtualViewHysteresisRatioCache = d10;
        }
        return d10.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewPrerenderRatio() {
        Double d10 = this.virtualViewPrerenderRatioCache;
        if (d10 == null) {
            d10 = Double.valueOf(this.currentProvider.virtualViewPrerenderRatio());
            this.accessedFeatureFlags.add("virtualViewPrerenderRatio");
            this.virtualViewPrerenderRatioCache = d10;
        }
        return d10.doubleValue();
    }
}
