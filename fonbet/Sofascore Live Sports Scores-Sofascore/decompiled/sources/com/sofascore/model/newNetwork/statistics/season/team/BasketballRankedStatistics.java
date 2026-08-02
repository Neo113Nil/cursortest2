package com.sofascore.model.newNetwork.statistics.season.team;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u009b\u0001\u009a\u0001B\u0097\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,B³\u0003\b\u0010\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b+\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00104J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00104J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00104J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00104J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00104J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00104J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00104J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00104J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00104J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00104J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00104J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00104J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00104J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00104J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00104J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00104J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00104J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00104J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00104J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00104J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00104J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00104J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00104J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00104J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00104J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00104J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00104J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00104J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00104J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00104J\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u00104J\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u00104J\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00104J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u00104J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u00104J\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u00104Jð\u0003\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010_\u001a\u00020^HÖ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020-HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010f\u001a\u00020e2\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\bf\u0010gJ'\u0010p\u001a\u00020m2\u0006\u0010h\u001a\u00020\u00002\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020kH\u0001¢\u0006\u0004\bn\u0010oR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010q\u001a\u0004\br\u00104R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010q\u001a\u0004\bs\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010q\u001a\u0004\bt\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010q\u001a\u0004\bu\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010q\u001a\u0004\bv\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010q\u001a\u0004\bw\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\bx\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\by\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010q\u001a\u0004\bz\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010q\u001a\u0004\b{\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010q\u001a\u0004\b|\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010q\u001a\u0004\b}\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010q\u001a\u0004\b~\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010q\u001a\u0004\b\u007f\u00104R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0011\u0010q\u001a\u0005\b\u0080\u0001\u00104R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010q\u001a\u0005\b\u0081\u0001\u00104R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0013\u0010q\u001a\u0005\b\u0082\u0001\u00104R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010q\u001a\u0005\b\u0083\u0001\u00104R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0015\u0010q\u001a\u0005\b\u0084\u0001\u00104R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0016\u0010q\u001a\u0005\b\u0085\u0001\u00104R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0017\u0010q\u001a\u0005\b\u0086\u0001\u00104R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010q\u001a\u0005\b\u0087\u0001\u00104R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010q\u001a\u0005\b\u0088\u0001\u00104R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010q\u001a\u0005\b\u0089\u0001\u00104R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001b\u0010q\u001a\u0005\b\u008a\u0001\u00104R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010q\u001a\u0005\b\u008b\u0001\u00104R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010q\u001a\u0005\b\u008c\u0001\u00104R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010q\u001a\u0005\b\u008d\u0001\u00104R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010q\u001a\u0005\b\u008e\u0001\u00104R\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010q\u001a\u0005\b\u008f\u0001\u00104R\u001a\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010q\u001a\u0005\b\u0090\u0001\u00104R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010q\u001a\u0005\b\u0091\u0001\u00104R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010q\u001a\u0005\b\u0092\u0001\u00104R\u001a\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010q\u001a\u0005\b\u0093\u0001\u00104R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010q\u001a\u0005\b\u0094\u0001\u00104R\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010q\u001a\u0005\b\u0095\u0001\u00104R\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b'\u0010q\u001a\u0005\b\u0096\u0001\u00104R\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b(\u0010q\u001a\u0005\b\u0097\u0001\u00104R\u001a\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b)\u0010q\u001a\u0005\b\u0098\u0001\u00104R\u001a\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b*\u0010q\u001a\u0005\b\u0099\u0001\u00104¨\u0006\u009c\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "points", "twoPointsMade", "twoPointAttempts", "threePointsMade", "threePointAttempts", "freeThrowsMade", "freeThrowAttempts", "fieldGoalsMade", "fieldGoalAttempts", "rebounds", "offensiveRebounds", "defensiveRebounds", "turnovers", "blocks", "personalFouls", "offensiveFoulsAgainst", "flagrantFouls", "technicalFouls", "assists", "steals", "fieldGoalsPercentage", "fieldGoalsPercentageAgainst", "freeThrowsPercentage", "threePointsPercentage", "twoPointsPercentage", "effectiveFieldGoalPercentage", "trueShootingPercentage", "assistTurnoverRatio", "pointsAgainst", "fastbreakPoints", "benchPoints", "pointsInPaint", "secondChancePoints", "personalFoulsAgainst", "trueShootingPercentageAgainst", "threePointsPercentageAgainst", "pace", "offensiveRating", "defensiveRating", "netRating", "<init>", "(Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;)V", "", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lt5h;)V", "component1", "()Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;)Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "getPoints", "getTwoPointsMade", "getTwoPointAttempts", "getThreePointsMade", "getThreePointAttempts", "getFreeThrowsMade", "getFreeThrowAttempts", "getFieldGoalsMade", "getFieldGoalAttempts", "getRebounds", "getOffensiveRebounds", "getDefensiveRebounds", "getTurnovers", "getBlocks", "getPersonalFouls", "getOffensiveFoulsAgainst", "getFlagrantFouls", "getTechnicalFouls", "getAssists", "getSteals", "getFieldGoalsPercentage", "getFieldGoalsPercentageAgainst", "getFreeThrowsPercentage", "getThreePointsPercentage", "getTwoPointsPercentage", "getEffectiveFieldGoalPercentage", "getTrueShootingPercentage", "getAssistTurnoverRatio", "getPointsAgainst", "getFastbreakPoints", "getBenchPoints", "getPointsInPaint", "getSecondChancePoints", "getPersonalFoulsAgainst", "getTrueShootingPercentageAgainst", "getThreePointsPercentageAgainst", "getPace", "getOffensiveRating", "getDefensiveRating", "getNetRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballRankedStatistics implements TeamSeasonStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final RankedStatistic assistTurnoverRatio;

    @Nullable
    private final RankedStatistic assists;

    @Nullable
    private final RankedStatistic benchPoints;

    @Nullable
    private final RankedStatistic blocks;

    @Nullable
    private final RankedStatistic defensiveRating;

    @Nullable
    private final RankedStatistic defensiveRebounds;

    @Nullable
    private final RankedStatistic effectiveFieldGoalPercentage;

    @Nullable
    private final RankedStatistic fastbreakPoints;

    @Nullable
    private final RankedStatistic fieldGoalAttempts;

    @Nullable
    private final RankedStatistic fieldGoalsMade;

    @Nullable
    private final RankedStatistic fieldGoalsPercentage;

    @Nullable
    private final RankedStatistic fieldGoalsPercentageAgainst;

    @Nullable
    private final RankedStatistic flagrantFouls;

    @Nullable
    private final RankedStatistic freeThrowAttempts;

    @Nullable
    private final RankedStatistic freeThrowsMade;

    @Nullable
    private final RankedStatistic freeThrowsPercentage;

    @Nullable
    private final RankedStatistic netRating;

    @Nullable
    private final RankedStatistic offensiveFoulsAgainst;

    @Nullable
    private final RankedStatistic offensiveRating;

    @Nullable
    private final RankedStatistic offensiveRebounds;

    @Nullable
    private final RankedStatistic pace;

    @Nullable
    private final RankedStatistic personalFouls;

    @Nullable
    private final RankedStatistic personalFoulsAgainst;

    @Nullable
    private final RankedStatistic points;

    @Nullable
    private final RankedStatistic pointsAgainst;

    @Nullable
    private final RankedStatistic pointsInPaint;

    @Nullable
    private final RankedStatistic rebounds;

    @Nullable
    private final RankedStatistic secondChancePoints;

    @Nullable
    private final RankedStatistic steals;

    @Nullable
    private final RankedStatistic technicalFouls;

    @Nullable
    private final RankedStatistic threePointAttempts;

    @Nullable
    private final RankedStatistic threePointsMade;

    @Nullable
    private final RankedStatistic threePointsPercentage;

    @Nullable
    private final RankedStatistic threePointsPercentageAgainst;

    @Nullable
    private final RankedStatistic trueShootingPercentage;

    @Nullable
    private final RankedStatistic trueShootingPercentageAgainst;

    @Nullable
    private final RankedStatistic turnovers;

    @Nullable
    private final RankedStatistic twoPointAttempts;

    @Nullable
    private final RankedStatistic twoPointsMade;

    @Nullable
    private final RankedStatistic twoPointsPercentage;

    public /* synthetic */ BasketballRankedStatistics(int i, int i2, RankedStatistic rankedStatistic, RankedStatistic rankedStatistic2, RankedStatistic rankedStatistic3, RankedStatistic rankedStatistic4, RankedStatistic rankedStatistic5, RankedStatistic rankedStatistic6, RankedStatistic rankedStatistic7, RankedStatistic rankedStatistic8, RankedStatistic rankedStatistic9, RankedStatistic rankedStatistic10, RankedStatistic rankedStatistic11, RankedStatistic rankedStatistic12, RankedStatistic rankedStatistic13, RankedStatistic rankedStatistic14, RankedStatistic rankedStatistic15, RankedStatistic rankedStatistic16, RankedStatistic rankedStatistic17, RankedStatistic rankedStatistic18, RankedStatistic rankedStatistic19, RankedStatistic rankedStatistic20, RankedStatistic rankedStatistic21, RankedStatistic rankedStatistic22, RankedStatistic rankedStatistic23, RankedStatistic rankedStatistic24, RankedStatistic rankedStatistic25, RankedStatistic rankedStatistic26, RankedStatistic rankedStatistic27, RankedStatistic rankedStatistic28, RankedStatistic rankedStatistic29, RankedStatistic rankedStatistic30, RankedStatistic rankedStatistic31, RankedStatistic rankedStatistic32, RankedStatistic rankedStatistic33, RankedStatistic rankedStatistic34, RankedStatistic rankedStatistic35, RankedStatistic rankedStatistic36, RankedStatistic rankedStatistic37, RankedStatistic rankedStatistic38, RankedStatistic rankedStatistic39, RankedStatistic rankedStatistic40, t5h t5hVar) {
        if ((255 != (i2 & 255)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 255}, BasketballRankedStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = rankedStatistic;
        this.twoPointsMade = rankedStatistic2;
        this.twoPointAttempts = rankedStatistic3;
        this.threePointsMade = rankedStatistic4;
        this.threePointAttempts = rankedStatistic5;
        this.freeThrowsMade = rankedStatistic6;
        this.freeThrowAttempts = rankedStatistic7;
        this.fieldGoalsMade = rankedStatistic8;
        this.fieldGoalAttempts = rankedStatistic9;
        this.rebounds = rankedStatistic10;
        this.offensiveRebounds = rankedStatistic11;
        this.defensiveRebounds = rankedStatistic12;
        this.turnovers = rankedStatistic13;
        this.blocks = rankedStatistic14;
        this.personalFouls = rankedStatistic15;
        this.offensiveFoulsAgainst = rankedStatistic16;
        this.flagrantFouls = rankedStatistic17;
        this.technicalFouls = rankedStatistic18;
        this.assists = rankedStatistic19;
        this.steals = rankedStatistic20;
        this.fieldGoalsPercentage = rankedStatistic21;
        this.fieldGoalsPercentageAgainst = rankedStatistic22;
        this.freeThrowsPercentage = rankedStatistic23;
        this.threePointsPercentage = rankedStatistic24;
        this.twoPointsPercentage = rankedStatistic25;
        this.effectiveFieldGoalPercentage = rankedStatistic26;
        this.trueShootingPercentage = rankedStatistic27;
        this.assistTurnoverRatio = rankedStatistic28;
        this.pointsAgainst = rankedStatistic29;
        this.fastbreakPoints = rankedStatistic30;
        this.benchPoints = rankedStatistic31;
        this.pointsInPaint = rankedStatistic32;
        this.secondChancePoints = rankedStatistic33;
        this.personalFoulsAgainst = rankedStatistic34;
        this.trueShootingPercentageAgainst = rankedStatistic35;
        this.threePointsPercentageAgainst = rankedStatistic36;
        this.pace = rankedStatistic37;
        this.offensiveRating = rankedStatistic38;
        this.defensiveRating = rankedStatistic39;
        this.netRating = rankedStatistic40;
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballRankedStatistics self, wf3 output, SerialDescriptor serialDesc) {
        RankedStatistic$$serializer rankedStatistic$$serializer = RankedStatistic$$serializer.INSTANCE;
        output.h(serialDesc, 0, rankedStatistic$$serializer, self.points);
        output.h(serialDesc, 1, rankedStatistic$$serializer, self.twoPointsMade);
        output.h(serialDesc, 2, rankedStatistic$$serializer, self.twoPointAttempts);
        output.h(serialDesc, 3, rankedStatistic$$serializer, self.threePointsMade);
        output.h(serialDesc, 4, rankedStatistic$$serializer, self.threePointAttempts);
        output.h(serialDesc, 5, rankedStatistic$$serializer, self.freeThrowsMade);
        output.h(serialDesc, 6, rankedStatistic$$serializer, self.freeThrowAttempts);
        output.h(serialDesc, 7, rankedStatistic$$serializer, self.fieldGoalsMade);
        output.h(serialDesc, 8, rankedStatistic$$serializer, self.fieldGoalAttempts);
        output.h(serialDesc, 9, rankedStatistic$$serializer, self.rebounds);
        output.h(serialDesc, 10, rankedStatistic$$serializer, self.offensiveRebounds);
        output.h(serialDesc, 11, rankedStatistic$$serializer, self.defensiveRebounds);
        output.h(serialDesc, 12, rankedStatistic$$serializer, self.turnovers);
        output.h(serialDesc, 13, rankedStatistic$$serializer, self.blocks);
        output.h(serialDesc, 14, rankedStatistic$$serializer, self.personalFouls);
        output.h(serialDesc, 15, rankedStatistic$$serializer, self.offensiveFoulsAgainst);
        output.h(serialDesc, 16, rankedStatistic$$serializer, self.flagrantFouls);
        output.h(serialDesc, 17, rankedStatistic$$serializer, self.technicalFouls);
        output.h(serialDesc, 18, rankedStatistic$$serializer, self.assists);
        output.h(serialDesc, 19, rankedStatistic$$serializer, self.steals);
        output.h(serialDesc, 20, rankedStatistic$$serializer, self.fieldGoalsPercentage);
        output.h(serialDesc, 21, rankedStatistic$$serializer, self.fieldGoalsPercentageAgainst);
        output.h(serialDesc, 22, rankedStatistic$$serializer, self.freeThrowsPercentage);
        output.h(serialDesc, 23, rankedStatistic$$serializer, self.threePointsPercentage);
        output.h(serialDesc, 24, rankedStatistic$$serializer, self.twoPointsPercentage);
        output.h(serialDesc, 25, rankedStatistic$$serializer, self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 26, rankedStatistic$$serializer, self.trueShootingPercentage);
        output.h(serialDesc, 27, rankedStatistic$$serializer, self.assistTurnoverRatio);
        output.h(serialDesc, 28, rankedStatistic$$serializer, self.pointsAgainst);
        output.h(serialDesc, 29, rankedStatistic$$serializer, self.fastbreakPoints);
        output.h(serialDesc, 30, rankedStatistic$$serializer, self.benchPoints);
        output.h(serialDesc, 31, rankedStatistic$$serializer, self.pointsInPaint);
        output.h(serialDesc, 32, rankedStatistic$$serializer, self.secondChancePoints);
        output.h(serialDesc, 33, rankedStatistic$$serializer, self.personalFoulsAgainst);
        output.h(serialDesc, 34, rankedStatistic$$serializer, self.trueShootingPercentageAgainst);
        output.h(serialDesc, 35, rankedStatistic$$serializer, self.threePointsPercentageAgainst);
        output.h(serialDesc, 36, rankedStatistic$$serializer, self.pace);
        output.h(serialDesc, 37, rankedStatistic$$serializer, self.offensiveRating);
        output.h(serialDesc, 38, rankedStatistic$$serializer, self.defensiveRating);
        output.h(serialDesc, 39, rankedStatistic$$serializer, self.netRating);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final RankedStatistic getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final RankedStatistic getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final RankedStatistic getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final RankedStatistic getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final RankedStatistic getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final RankedStatistic getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final RankedStatistic getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final RankedStatistic getOffensiveFoulsAgainst() {
        return this.offensiveFoulsAgainst;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final RankedStatistic getFlagrantFouls() {
        return this.flagrantFouls;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final RankedStatistic getTechnicalFouls() {
        return this.technicalFouls;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final RankedStatistic getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RankedStatistic getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final RankedStatistic getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final RankedStatistic getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final RankedStatistic getFieldGoalsPercentageAgainst() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final RankedStatistic getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final RankedStatistic getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final RankedStatistic getTwoPointsPercentage() {
        return this.twoPointsPercentage;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final RankedStatistic getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final RankedStatistic getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final RankedStatistic getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final RankedStatistic getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final RankedStatistic getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final RankedStatistic getFastbreakPoints() {
        return this.fastbreakPoints;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final RankedStatistic getBenchPoints() {
        return this.benchPoints;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final RankedStatistic getPointsInPaint() {
        return this.pointsInPaint;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final RankedStatistic getSecondChancePoints() {
        return this.secondChancePoints;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final RankedStatistic getPersonalFoulsAgainst() {
        return this.personalFoulsAgainst;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final RankedStatistic getTrueShootingPercentageAgainst() {
        return this.trueShootingPercentageAgainst;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final RankedStatistic getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final RankedStatistic getPace() {
        return this.pace;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final RankedStatistic getOffensiveRating() {
        return this.offensiveRating;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final RankedStatistic getDefensiveRating() {
        return this.defensiveRating;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final RankedStatistic getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final RankedStatistic getNetRating() {
        return this.netRating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final RankedStatistic getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final RankedStatistic getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final RankedStatistic getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final RankedStatistic getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final RankedStatistic getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @NotNull
    public final BasketballRankedStatistics copy(@Nullable RankedStatistic points, @Nullable RankedStatistic twoPointsMade, @Nullable RankedStatistic twoPointAttempts, @Nullable RankedStatistic threePointsMade, @Nullable RankedStatistic threePointAttempts, @Nullable RankedStatistic freeThrowsMade, @Nullable RankedStatistic freeThrowAttempts, @Nullable RankedStatistic fieldGoalsMade, @Nullable RankedStatistic fieldGoalAttempts, @Nullable RankedStatistic rebounds, @Nullable RankedStatistic offensiveRebounds, @Nullable RankedStatistic defensiveRebounds, @Nullable RankedStatistic turnovers, @Nullable RankedStatistic blocks, @Nullable RankedStatistic personalFouls, @Nullable RankedStatistic offensiveFoulsAgainst, @Nullable RankedStatistic flagrantFouls, @Nullable RankedStatistic technicalFouls, @Nullable RankedStatistic assists, @Nullable RankedStatistic steals, @Nullable RankedStatistic fieldGoalsPercentage, @Nullable RankedStatistic fieldGoalsPercentageAgainst, @Nullable RankedStatistic freeThrowsPercentage, @Nullable RankedStatistic threePointsPercentage, @Nullable RankedStatistic twoPointsPercentage, @Nullable RankedStatistic effectiveFieldGoalPercentage, @Nullable RankedStatistic trueShootingPercentage, @Nullable RankedStatistic assistTurnoverRatio, @Nullable RankedStatistic pointsAgainst, @Nullable RankedStatistic fastbreakPoints, @Nullable RankedStatistic benchPoints, @Nullable RankedStatistic pointsInPaint, @Nullable RankedStatistic secondChancePoints, @Nullable RankedStatistic personalFoulsAgainst, @Nullable RankedStatistic trueShootingPercentageAgainst, @Nullable RankedStatistic threePointsPercentageAgainst, @Nullable RankedStatistic pace, @Nullable RankedStatistic offensiveRating, @Nullable RankedStatistic defensiveRating, @Nullable RankedStatistic netRating) {
        return new BasketballRankedStatistics(points, twoPointsMade, twoPointAttempts, threePointsMade, threePointAttempts, freeThrowsMade, freeThrowAttempts, fieldGoalsMade, fieldGoalAttempts, rebounds, offensiveRebounds, defensiveRebounds, turnovers, blocks, personalFouls, offensiveFoulsAgainst, flagrantFouls, technicalFouls, assists, steals, fieldGoalsPercentage, fieldGoalsPercentageAgainst, freeThrowsPercentage, threePointsPercentage, twoPointsPercentage, effectiveFieldGoalPercentage, trueShootingPercentage, assistTurnoverRatio, pointsAgainst, fastbreakPoints, benchPoints, pointsInPaint, secondChancePoints, personalFoulsAgainst, trueShootingPercentageAgainst, threePointsPercentageAgainst, pace, offensiveRating, defensiveRating, netRating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballRankedStatistics)) {
            return false;
        }
        BasketballRankedStatistics basketballRankedStatistics = (BasketballRankedStatistics) other;
        return Intrinsics.c(this.points, basketballRankedStatistics.points) && Intrinsics.c(this.twoPointsMade, basketballRankedStatistics.twoPointsMade) && Intrinsics.c(this.twoPointAttempts, basketballRankedStatistics.twoPointAttempts) && Intrinsics.c(this.threePointsMade, basketballRankedStatistics.threePointsMade) && Intrinsics.c(this.threePointAttempts, basketballRankedStatistics.threePointAttempts) && Intrinsics.c(this.freeThrowsMade, basketballRankedStatistics.freeThrowsMade) && Intrinsics.c(this.freeThrowAttempts, basketballRankedStatistics.freeThrowAttempts) && Intrinsics.c(this.fieldGoalsMade, basketballRankedStatistics.fieldGoalsMade) && Intrinsics.c(this.fieldGoalAttempts, basketballRankedStatistics.fieldGoalAttempts) && Intrinsics.c(this.rebounds, basketballRankedStatistics.rebounds) && Intrinsics.c(this.offensiveRebounds, basketballRankedStatistics.offensiveRebounds) && Intrinsics.c(this.defensiveRebounds, basketballRankedStatistics.defensiveRebounds) && Intrinsics.c(this.turnovers, basketballRankedStatistics.turnovers) && Intrinsics.c(this.blocks, basketballRankedStatistics.blocks) && Intrinsics.c(this.personalFouls, basketballRankedStatistics.personalFouls) && Intrinsics.c(this.offensiveFoulsAgainst, basketballRankedStatistics.offensiveFoulsAgainst) && Intrinsics.c(this.flagrantFouls, basketballRankedStatistics.flagrantFouls) && Intrinsics.c(this.technicalFouls, basketballRankedStatistics.technicalFouls) && Intrinsics.c(this.assists, basketballRankedStatistics.assists) && Intrinsics.c(this.steals, basketballRankedStatistics.steals) && Intrinsics.c(this.fieldGoalsPercentage, basketballRankedStatistics.fieldGoalsPercentage) && Intrinsics.c(this.fieldGoalsPercentageAgainst, basketballRankedStatistics.fieldGoalsPercentageAgainst) && Intrinsics.c(this.freeThrowsPercentage, basketballRankedStatistics.freeThrowsPercentage) && Intrinsics.c(this.threePointsPercentage, basketballRankedStatistics.threePointsPercentage) && Intrinsics.c(this.twoPointsPercentage, basketballRankedStatistics.twoPointsPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballRankedStatistics.effectiveFieldGoalPercentage) && Intrinsics.c(this.trueShootingPercentage, basketballRankedStatistics.trueShootingPercentage) && Intrinsics.c(this.assistTurnoverRatio, basketballRankedStatistics.assistTurnoverRatio) && Intrinsics.c(this.pointsAgainst, basketballRankedStatistics.pointsAgainst) && Intrinsics.c(this.fastbreakPoints, basketballRankedStatistics.fastbreakPoints) && Intrinsics.c(this.benchPoints, basketballRankedStatistics.benchPoints) && Intrinsics.c(this.pointsInPaint, basketballRankedStatistics.pointsInPaint) && Intrinsics.c(this.secondChancePoints, basketballRankedStatistics.secondChancePoints) && Intrinsics.c(this.personalFoulsAgainst, basketballRankedStatistics.personalFoulsAgainst) && Intrinsics.c(this.trueShootingPercentageAgainst, basketballRankedStatistics.trueShootingPercentageAgainst) && Intrinsics.c(this.threePointsPercentageAgainst, basketballRankedStatistics.threePointsPercentageAgainst) && Intrinsics.c(this.pace, basketballRankedStatistics.pace) && Intrinsics.c(this.offensiveRating, basketballRankedStatistics.offensiveRating) && Intrinsics.c(this.defensiveRating, basketballRankedStatistics.defensiveRating) && Intrinsics.c(this.netRating, basketballRankedStatistics.netRating);
    }

    @Nullable
    public final RankedStatistic getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final RankedStatistic getAssists() {
        return this.assists;
    }

    @Nullable
    public final RankedStatistic getBenchPoints() {
        return this.benchPoints;
    }

    @Nullable
    public final RankedStatistic getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final RankedStatistic getDefensiveRating() {
        return this.defensiveRating;
    }

    @Nullable
    public final RankedStatistic getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final RankedStatistic getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final RankedStatistic getFastbreakPoints() {
        return this.fastbreakPoints;
    }

    @Nullable
    public final RankedStatistic getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @Nullable
    public final RankedStatistic getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    public final RankedStatistic getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final RankedStatistic getFieldGoalsPercentageAgainst() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    public final RankedStatistic getFlagrantFouls() {
        return this.flagrantFouls;
    }

    @Nullable
    public final RankedStatistic getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    public final RankedStatistic getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    public final RankedStatistic getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final RankedStatistic getNetRating() {
        return this.netRating;
    }

    @Nullable
    public final RankedStatistic getOffensiveFoulsAgainst() {
        return this.offensiveFoulsAgainst;
    }

    @Nullable
    public final RankedStatistic getOffensiveRating() {
        return this.offensiveRating;
    }

    @Nullable
    public final RankedStatistic getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final RankedStatistic getPace() {
        return this.pace;
    }

    @Nullable
    public final RankedStatistic getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    public final RankedStatistic getPersonalFoulsAgainst() {
        return this.personalFoulsAgainst;
    }

    @Nullable
    public final RankedStatistic getPoints() {
        return this.points;
    }

    @Nullable
    public final RankedStatistic getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    public final RankedStatistic getPointsInPaint() {
        return this.pointsInPaint;
    }

    @Nullable
    public final RankedStatistic getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final RankedStatistic getSecondChancePoints() {
        return this.secondChancePoints;
    }

    @Nullable
    public final RankedStatistic getSteals() {
        return this.steals;
    }

    @Nullable
    public final RankedStatistic getTechnicalFouls() {
        return this.technicalFouls;
    }

    @Nullable
    public final RankedStatistic getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    public final RankedStatistic getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final RankedStatistic getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final RankedStatistic getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    public final RankedStatistic getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final RankedStatistic getTrueShootingPercentageAgainst() {
        return this.trueShootingPercentageAgainst;
    }

    @Nullable
    public final RankedStatistic getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    public final RankedStatistic getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    public final RankedStatistic getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @Nullable
    public final RankedStatistic getTwoPointsPercentage() {
        return this.twoPointsPercentage;
    }

    public int hashCode() {
        RankedStatistic rankedStatistic = this.points;
        int hashCode = (rankedStatistic == null ? 0 : rankedStatistic.hashCode()) * 31;
        RankedStatistic rankedStatistic2 = this.twoPointsMade;
        int hashCode2 = (hashCode + (rankedStatistic2 == null ? 0 : rankedStatistic2.hashCode())) * 31;
        RankedStatistic rankedStatistic3 = this.twoPointAttempts;
        int hashCode3 = (hashCode2 + (rankedStatistic3 == null ? 0 : rankedStatistic3.hashCode())) * 31;
        RankedStatistic rankedStatistic4 = this.threePointsMade;
        int hashCode4 = (hashCode3 + (rankedStatistic4 == null ? 0 : rankedStatistic4.hashCode())) * 31;
        RankedStatistic rankedStatistic5 = this.threePointAttempts;
        int hashCode5 = (hashCode4 + (rankedStatistic5 == null ? 0 : rankedStatistic5.hashCode())) * 31;
        RankedStatistic rankedStatistic6 = this.freeThrowsMade;
        int hashCode6 = (hashCode5 + (rankedStatistic6 == null ? 0 : rankedStatistic6.hashCode())) * 31;
        RankedStatistic rankedStatistic7 = this.freeThrowAttempts;
        int hashCode7 = (hashCode6 + (rankedStatistic7 == null ? 0 : rankedStatistic7.hashCode())) * 31;
        RankedStatistic rankedStatistic8 = this.fieldGoalsMade;
        int hashCode8 = (hashCode7 + (rankedStatistic8 == null ? 0 : rankedStatistic8.hashCode())) * 31;
        RankedStatistic rankedStatistic9 = this.fieldGoalAttempts;
        int hashCode9 = (hashCode8 + (rankedStatistic9 == null ? 0 : rankedStatistic9.hashCode())) * 31;
        RankedStatistic rankedStatistic10 = this.rebounds;
        int hashCode10 = (hashCode9 + (rankedStatistic10 == null ? 0 : rankedStatistic10.hashCode())) * 31;
        RankedStatistic rankedStatistic11 = this.offensiveRebounds;
        int hashCode11 = (hashCode10 + (rankedStatistic11 == null ? 0 : rankedStatistic11.hashCode())) * 31;
        RankedStatistic rankedStatistic12 = this.defensiveRebounds;
        int hashCode12 = (hashCode11 + (rankedStatistic12 == null ? 0 : rankedStatistic12.hashCode())) * 31;
        RankedStatistic rankedStatistic13 = this.turnovers;
        int hashCode13 = (hashCode12 + (rankedStatistic13 == null ? 0 : rankedStatistic13.hashCode())) * 31;
        RankedStatistic rankedStatistic14 = this.blocks;
        int hashCode14 = (hashCode13 + (rankedStatistic14 == null ? 0 : rankedStatistic14.hashCode())) * 31;
        RankedStatistic rankedStatistic15 = this.personalFouls;
        int hashCode15 = (hashCode14 + (rankedStatistic15 == null ? 0 : rankedStatistic15.hashCode())) * 31;
        RankedStatistic rankedStatistic16 = this.offensiveFoulsAgainst;
        int hashCode16 = (hashCode15 + (rankedStatistic16 == null ? 0 : rankedStatistic16.hashCode())) * 31;
        RankedStatistic rankedStatistic17 = this.flagrantFouls;
        int hashCode17 = (hashCode16 + (rankedStatistic17 == null ? 0 : rankedStatistic17.hashCode())) * 31;
        RankedStatistic rankedStatistic18 = this.technicalFouls;
        int hashCode18 = (hashCode17 + (rankedStatistic18 == null ? 0 : rankedStatistic18.hashCode())) * 31;
        RankedStatistic rankedStatistic19 = this.assists;
        int hashCode19 = (hashCode18 + (rankedStatistic19 == null ? 0 : rankedStatistic19.hashCode())) * 31;
        RankedStatistic rankedStatistic20 = this.steals;
        int hashCode20 = (hashCode19 + (rankedStatistic20 == null ? 0 : rankedStatistic20.hashCode())) * 31;
        RankedStatistic rankedStatistic21 = this.fieldGoalsPercentage;
        int hashCode21 = (hashCode20 + (rankedStatistic21 == null ? 0 : rankedStatistic21.hashCode())) * 31;
        RankedStatistic rankedStatistic22 = this.fieldGoalsPercentageAgainst;
        int hashCode22 = (hashCode21 + (rankedStatistic22 == null ? 0 : rankedStatistic22.hashCode())) * 31;
        RankedStatistic rankedStatistic23 = this.freeThrowsPercentage;
        int hashCode23 = (hashCode22 + (rankedStatistic23 == null ? 0 : rankedStatistic23.hashCode())) * 31;
        RankedStatistic rankedStatistic24 = this.threePointsPercentage;
        int hashCode24 = (hashCode23 + (rankedStatistic24 == null ? 0 : rankedStatistic24.hashCode())) * 31;
        RankedStatistic rankedStatistic25 = this.twoPointsPercentage;
        int hashCode25 = (hashCode24 + (rankedStatistic25 == null ? 0 : rankedStatistic25.hashCode())) * 31;
        RankedStatistic rankedStatistic26 = this.effectiveFieldGoalPercentage;
        int hashCode26 = (hashCode25 + (rankedStatistic26 == null ? 0 : rankedStatistic26.hashCode())) * 31;
        RankedStatistic rankedStatistic27 = this.trueShootingPercentage;
        int hashCode27 = (hashCode26 + (rankedStatistic27 == null ? 0 : rankedStatistic27.hashCode())) * 31;
        RankedStatistic rankedStatistic28 = this.assistTurnoverRatio;
        int hashCode28 = (hashCode27 + (rankedStatistic28 == null ? 0 : rankedStatistic28.hashCode())) * 31;
        RankedStatistic rankedStatistic29 = this.pointsAgainst;
        int hashCode29 = (hashCode28 + (rankedStatistic29 == null ? 0 : rankedStatistic29.hashCode())) * 31;
        RankedStatistic rankedStatistic30 = this.fastbreakPoints;
        int hashCode30 = (hashCode29 + (rankedStatistic30 == null ? 0 : rankedStatistic30.hashCode())) * 31;
        RankedStatistic rankedStatistic31 = this.benchPoints;
        int hashCode31 = (hashCode30 + (rankedStatistic31 == null ? 0 : rankedStatistic31.hashCode())) * 31;
        RankedStatistic rankedStatistic32 = this.pointsInPaint;
        int hashCode32 = (hashCode31 + (rankedStatistic32 == null ? 0 : rankedStatistic32.hashCode())) * 31;
        RankedStatistic rankedStatistic33 = this.secondChancePoints;
        int hashCode33 = (hashCode32 + (rankedStatistic33 == null ? 0 : rankedStatistic33.hashCode())) * 31;
        RankedStatistic rankedStatistic34 = this.personalFoulsAgainst;
        int hashCode34 = (hashCode33 + (rankedStatistic34 == null ? 0 : rankedStatistic34.hashCode())) * 31;
        RankedStatistic rankedStatistic35 = this.trueShootingPercentageAgainst;
        int hashCode35 = (hashCode34 + (rankedStatistic35 == null ? 0 : rankedStatistic35.hashCode())) * 31;
        RankedStatistic rankedStatistic36 = this.threePointsPercentageAgainst;
        int hashCode36 = (hashCode35 + (rankedStatistic36 == null ? 0 : rankedStatistic36.hashCode())) * 31;
        RankedStatistic rankedStatistic37 = this.pace;
        int hashCode37 = (hashCode36 + (rankedStatistic37 == null ? 0 : rankedStatistic37.hashCode())) * 31;
        RankedStatistic rankedStatistic38 = this.offensiveRating;
        int hashCode38 = (hashCode37 + (rankedStatistic38 == null ? 0 : rankedStatistic38.hashCode())) * 31;
        RankedStatistic rankedStatistic39 = this.defensiveRating;
        int hashCode39 = (hashCode38 + (rankedStatistic39 == null ? 0 : rankedStatistic39.hashCode())) * 31;
        RankedStatistic rankedStatistic40 = this.netRating;
        return hashCode39 + (rankedStatistic40 != null ? rankedStatistic40.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasketballRankedStatistics(points=" + this.points + ", twoPointsMade=" + this.twoPointsMade + ", twoPointAttempts=" + this.twoPointAttempts + ", threePointsMade=" + this.threePointsMade + ", threePointAttempts=" + this.threePointAttempts + ", freeThrowsMade=" + this.freeThrowsMade + ", freeThrowAttempts=" + this.freeThrowAttempts + ", fieldGoalsMade=" + this.fieldGoalsMade + ", fieldGoalAttempts=" + this.fieldGoalAttempts + ", rebounds=" + this.rebounds + ", offensiveRebounds=" + this.offensiveRebounds + ", defensiveRebounds=" + this.defensiveRebounds + ", turnovers=" + this.turnovers + ", blocks=" + this.blocks + ", personalFouls=" + this.personalFouls + ", offensiveFoulsAgainst=" + this.offensiveFoulsAgainst + ", flagrantFouls=" + this.flagrantFouls + ", technicalFouls=" + this.technicalFouls + ", assists=" + this.assists + ", steals=" + this.steals + ", fieldGoalsPercentage=" + this.fieldGoalsPercentage + ", fieldGoalsPercentageAgainst=" + this.fieldGoalsPercentageAgainst + ", freeThrowsPercentage=" + this.freeThrowsPercentage + ", threePointsPercentage=" + this.threePointsPercentage + ", twoPointsPercentage=" + this.twoPointsPercentage + ", effectiveFieldGoalPercentage=" + this.effectiveFieldGoalPercentage + ", trueShootingPercentage=" + this.trueShootingPercentage + ", assistTurnoverRatio=" + this.assistTurnoverRatio + ", pointsAgainst=" + this.pointsAgainst + ", fastbreakPoints=" + this.fastbreakPoints + ", benchPoints=" + this.benchPoints + ", pointsInPaint=" + this.pointsInPaint + ", secondChancePoints=" + this.secondChancePoints + ", personalFoulsAgainst=" + this.personalFoulsAgainst + ", trueShootingPercentageAgainst=" + this.trueShootingPercentageAgainst + ", threePointsPercentageAgainst=" + this.threePointsPercentageAgainst + ", pace=" + this.pace + ", offensiveRating=" + this.offensiveRating + ", defensiveRating=" + this.defensiveRating + ", netRating=" + this.netRating + ")";
    }

    public BasketballRankedStatistics(@Nullable RankedStatistic rankedStatistic, @Nullable RankedStatistic rankedStatistic2, @Nullable RankedStatistic rankedStatistic3, @Nullable RankedStatistic rankedStatistic4, @Nullable RankedStatistic rankedStatistic5, @Nullable RankedStatistic rankedStatistic6, @Nullable RankedStatistic rankedStatistic7, @Nullable RankedStatistic rankedStatistic8, @Nullable RankedStatistic rankedStatistic9, @Nullable RankedStatistic rankedStatistic10, @Nullable RankedStatistic rankedStatistic11, @Nullable RankedStatistic rankedStatistic12, @Nullable RankedStatistic rankedStatistic13, @Nullable RankedStatistic rankedStatistic14, @Nullable RankedStatistic rankedStatistic15, @Nullable RankedStatistic rankedStatistic16, @Nullable RankedStatistic rankedStatistic17, @Nullable RankedStatistic rankedStatistic18, @Nullable RankedStatistic rankedStatistic19, @Nullable RankedStatistic rankedStatistic20, @Nullable RankedStatistic rankedStatistic21, @Nullable RankedStatistic rankedStatistic22, @Nullable RankedStatistic rankedStatistic23, @Nullable RankedStatistic rankedStatistic24, @Nullable RankedStatistic rankedStatistic25, @Nullable RankedStatistic rankedStatistic26, @Nullable RankedStatistic rankedStatistic27, @Nullable RankedStatistic rankedStatistic28, @Nullable RankedStatistic rankedStatistic29, @Nullable RankedStatistic rankedStatistic30, @Nullable RankedStatistic rankedStatistic31, @Nullable RankedStatistic rankedStatistic32, @Nullable RankedStatistic rankedStatistic33, @Nullable RankedStatistic rankedStatistic34, @Nullable RankedStatistic rankedStatistic35, @Nullable RankedStatistic rankedStatistic36, @Nullable RankedStatistic rankedStatistic37, @Nullable RankedStatistic rankedStatistic38, @Nullable RankedStatistic rankedStatistic39, @Nullable RankedStatistic rankedStatistic40) {
        this.points = rankedStatistic;
        this.twoPointsMade = rankedStatistic2;
        this.twoPointAttempts = rankedStatistic3;
        this.threePointsMade = rankedStatistic4;
        this.threePointAttempts = rankedStatistic5;
        this.freeThrowsMade = rankedStatistic6;
        this.freeThrowAttempts = rankedStatistic7;
        this.fieldGoalsMade = rankedStatistic8;
        this.fieldGoalAttempts = rankedStatistic9;
        this.rebounds = rankedStatistic10;
        this.offensiveRebounds = rankedStatistic11;
        this.defensiveRebounds = rankedStatistic12;
        this.turnovers = rankedStatistic13;
        this.blocks = rankedStatistic14;
        this.personalFouls = rankedStatistic15;
        this.offensiveFoulsAgainst = rankedStatistic16;
        this.flagrantFouls = rankedStatistic17;
        this.technicalFouls = rankedStatistic18;
        this.assists = rankedStatistic19;
        this.steals = rankedStatistic20;
        this.fieldGoalsPercentage = rankedStatistic21;
        this.fieldGoalsPercentageAgainst = rankedStatistic22;
        this.freeThrowsPercentage = rankedStatistic23;
        this.threePointsPercentage = rankedStatistic24;
        this.twoPointsPercentage = rankedStatistic25;
        this.effectiveFieldGoalPercentage = rankedStatistic26;
        this.trueShootingPercentage = rankedStatistic27;
        this.assistTurnoverRatio = rankedStatistic28;
        this.pointsAgainst = rankedStatistic29;
        this.fastbreakPoints = rankedStatistic30;
        this.benchPoints = rankedStatistic31;
        this.pointsInPaint = rankedStatistic32;
        this.secondChancePoints = rankedStatistic33;
        this.personalFoulsAgainst = rankedStatistic34;
        this.trueShootingPercentageAgainst = rankedStatistic35;
        this.threePointsPercentageAgainst = rankedStatistic36;
        this.pace = rankedStatistic37;
        this.offensiveRating = rankedStatistic38;
        this.defensiveRating = rankedStatistic39;
        this.netRating = rankedStatistic40;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballRankedStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
