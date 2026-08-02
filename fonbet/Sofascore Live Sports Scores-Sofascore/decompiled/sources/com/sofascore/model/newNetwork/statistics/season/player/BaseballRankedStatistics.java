package com.sofascore.model.newNetwork.statistics.season.player;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u007f\b\u0007\u0018\u0000 \u0086\u00022\u00020\u0001:\u0004\u0087\u0002\u0086\u0002B\u00ad\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010m\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010p\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010u\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010v\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010w\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010y\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bz\u0010{BÝ\t\b\u0010\u0012\u0006\u0010}\u001a\u00020|\u0012\u0006\u0010~\u001a\u00020|\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\u0007\u0010\u0080\u0001\u001a\u00020|\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010m\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010p\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010u\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010v\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010w\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010y\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001¢\u0006\u0005\bz\u0010\u0083\u0001J0\u0010\u008c\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00002\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0004\u0010\u008d\u0001\u001a\u0006\b\u0090\u0001\u0010\u008f\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u008d\u0001\u001a\u0006\b\u0091\u0001\u0010\u008f\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0006\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u008f\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\b\u0010\u008d\u0001\u001a\u0006\b\u0094\u0001\u0010\u008f\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\t\u0010\u008d\u0001\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\n\u0010\u008d\u0001\u001a\u0006\b\u0096\u0001\u0010\u008f\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010\u008d\u0001\u001a\u0006\b\u0097\u0001\u0010\u008f\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\f\u0010\u008d\u0001\u001a\u0006\b\u0098\u0001\u0010\u008f\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\r\u0010\u008d\u0001\u001a\u0006\b\u0099\u0001\u0010\u008f\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u000e\u0010\u008d\u0001\u001a\u0006\b\u009a\u0001\u0010\u008f\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u000f\u0010\u008d\u0001\u001a\u0006\b\u009b\u0001\u0010\u008f\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0010\u0010\u008d\u0001\u001a\u0006\b\u009c\u0001\u0010\u008f\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0011\u0010\u008d\u0001\u001a\u0006\b\u009d\u0001\u0010\u008f\u0001R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0012\u0010\u008d\u0001\u001a\u0006\b\u009e\u0001\u0010\u008f\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010\u008d\u0001\u001a\u0006\b\u009f\u0001\u0010\u008f\u0001R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0014\u0010\u008d\u0001\u001a\u0006\b \u0001\u0010\u008f\u0001R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010\u008d\u0001\u001a\u0006\b¡\u0001\u0010\u008f\u0001R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0016\u0010\u008d\u0001\u001a\u0006\b¢\u0001\u0010\u008f\u0001R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0017\u0010\u008d\u0001\u001a\u0006\b£\u0001\u0010\u008f\u0001R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0018\u0010\u008d\u0001\u001a\u0006\b¤\u0001\u0010\u008f\u0001R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0019\u0010\u008d\u0001\u001a\u0006\b¥\u0001\u0010\u008f\u0001R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001a\u0010\u008d\u0001\u001a\u0006\b¦\u0001\u0010\u008f\u0001R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001b\u0010\u008d\u0001\u001a\u0006\b§\u0001\u0010\u008f\u0001R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001c\u0010\u008d\u0001\u001a\u0006\b¨\u0001\u0010\u008f\u0001R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010\u008d\u0001\u001a\u0006\b©\u0001\u0010\u008f\u0001R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001e\u0010\u008d\u0001\u001a\u0006\bª\u0001\u0010\u008f\u0001R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u001f\u0010\u008d\u0001\u001a\u0006\b«\u0001\u0010\u008f\u0001R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b \u0010\u008d\u0001\u001a\u0006\b¬\u0001\u0010\u008f\u0001R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b!\u0010\u008d\u0001\u001a\u0006\b\u00ad\u0001\u0010\u008f\u0001R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\"\u0010\u008d\u0001\u001a\u0006\b®\u0001\u0010\u008f\u0001R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b#\u0010\u008d\u0001\u001a\u0006\b¯\u0001\u0010\u008f\u0001R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b$\u0010\u008d\u0001\u001a\u0006\b°\u0001\u0010\u008f\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b%\u0010\u008d\u0001\u001a\u0006\b±\u0001\u0010\u008f\u0001R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b&\u0010\u008d\u0001\u001a\u0006\b²\u0001\u0010\u008f\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b'\u0010\u008d\u0001\u001a\u0006\b³\u0001\u0010\u008f\u0001R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b(\u0010\u008d\u0001\u001a\u0006\b´\u0001\u0010\u008f\u0001R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b)\u0010\u008d\u0001\u001a\u0006\bµ\u0001\u0010\u008f\u0001R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b*\u0010\u008d\u0001\u001a\u0006\b¶\u0001\u0010\u008f\u0001R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b+\u0010\u008d\u0001\u001a\u0006\b·\u0001\u0010\u008f\u0001R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b,\u0010\u008d\u0001\u001a\u0006\b¸\u0001\u0010\u008f\u0001R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b-\u0010\u008d\u0001\u001a\u0006\b¹\u0001\u0010\u008f\u0001R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b.\u0010\u008d\u0001\u001a\u0006\bº\u0001\u0010\u008f\u0001R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b/\u0010\u008d\u0001\u001a\u0006\b»\u0001\u0010\u008f\u0001R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b0\u0010\u008d\u0001\u001a\u0006\b¼\u0001\u0010\u008f\u0001R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b1\u0010\u008d\u0001\u001a\u0006\b½\u0001\u0010\u008f\u0001R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b2\u0010\u008d\u0001\u001a\u0006\b¾\u0001\u0010\u008f\u0001R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b3\u0010\u008d\u0001\u001a\u0006\b¿\u0001\u0010\u008f\u0001R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b4\u0010\u008d\u0001\u001a\u0006\bÀ\u0001\u0010\u008f\u0001R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b5\u0010\u008d\u0001\u001a\u0006\bÁ\u0001\u0010\u008f\u0001R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b6\u0010\u008d\u0001\u001a\u0006\bÂ\u0001\u0010\u008f\u0001R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b7\u0010\u008d\u0001\u001a\u0006\bÃ\u0001\u0010\u008f\u0001R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b8\u0010\u008d\u0001\u001a\u0006\bÄ\u0001\u0010\u008f\u0001R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b9\u0010\u008d\u0001\u001a\u0006\bÅ\u0001\u0010\u008f\u0001R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b:\u0010\u008d\u0001\u001a\u0006\bÆ\u0001\u0010\u008f\u0001R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b;\u0010\u008d\u0001\u001a\u0006\bÇ\u0001\u0010\u008f\u0001R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b<\u0010\u008d\u0001\u001a\u0006\bÈ\u0001\u0010\u008f\u0001R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b=\u0010\u008d\u0001\u001a\u0006\bÉ\u0001\u0010\u008f\u0001R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b>\u0010\u008d\u0001\u001a\u0006\bÊ\u0001\u0010\u008f\u0001R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b?\u0010\u008d\u0001\u001a\u0006\bË\u0001\u0010\u008f\u0001R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b@\u0010\u008d\u0001\u001a\u0006\bÌ\u0001\u0010\u008f\u0001R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bA\u0010\u008d\u0001\u001a\u0006\bÍ\u0001\u0010\u008f\u0001R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bB\u0010\u008d\u0001\u001a\u0006\bÎ\u0001\u0010\u008f\u0001R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bC\u0010\u008d\u0001\u001a\u0006\bÏ\u0001\u0010\u008f\u0001R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bD\u0010\u008d\u0001\u001a\u0006\bÐ\u0001\u0010\u008f\u0001R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bE\u0010\u008d\u0001\u001a\u0006\bÑ\u0001\u0010\u008f\u0001R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bF\u0010\u008d\u0001\u001a\u0006\bÒ\u0001\u0010\u008f\u0001R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bG\u0010\u008d\u0001\u001a\u0006\bÓ\u0001\u0010\u008f\u0001R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bH\u0010\u008d\u0001\u001a\u0006\bÔ\u0001\u0010\u008f\u0001R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bI\u0010\u008d\u0001\u001a\u0006\bÕ\u0001\u0010\u008f\u0001R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bJ\u0010\u008d\u0001\u001a\u0006\bÖ\u0001\u0010\u008f\u0001R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bK\u0010\u008d\u0001\u001a\u0006\b×\u0001\u0010\u008f\u0001R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bL\u0010\u008d\u0001\u001a\u0006\bØ\u0001\u0010\u008f\u0001R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bM\u0010\u008d\u0001\u001a\u0006\bÙ\u0001\u0010\u008f\u0001R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bN\u0010\u008d\u0001\u001a\u0006\bÚ\u0001\u0010\u008f\u0001R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bO\u0010\u008d\u0001\u001a\u0006\bÛ\u0001\u0010\u008f\u0001R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bP\u0010\u008d\u0001\u001a\u0006\bÜ\u0001\u0010\u008f\u0001R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u008d\u0001\u001a\u0006\bÝ\u0001\u0010\u008f\u0001R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bR\u0010\u008d\u0001\u001a\u0006\bÞ\u0001\u0010\u008f\u0001R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bS\u0010\u008d\u0001\u001a\u0006\bß\u0001\u0010\u008f\u0001R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bT\u0010\u008d\u0001\u001a\u0006\bà\u0001\u0010\u008f\u0001R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bU\u0010\u008d\u0001\u001a\u0006\bá\u0001\u0010\u008f\u0001R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bV\u0010\u008d\u0001\u001a\u0006\bâ\u0001\u0010\u008f\u0001R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bW\u0010\u008d\u0001\u001a\u0006\bã\u0001\u0010\u008f\u0001R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bX\u0010\u008d\u0001\u001a\u0006\bä\u0001\u0010\u008f\u0001R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bY\u0010\u008d\u0001\u001a\u0006\bå\u0001\u0010\u008f\u0001R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bZ\u0010\u008d\u0001\u001a\u0006\bæ\u0001\u0010\u008f\u0001R\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b[\u0010\u008d\u0001\u001a\u0006\bç\u0001\u0010\u008f\u0001R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\\\u0010\u008d\u0001\u001a\u0006\bè\u0001\u0010\u008f\u0001R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b]\u0010\u008d\u0001\u001a\u0006\bé\u0001\u0010\u008f\u0001R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b^\u0010\u008d\u0001\u001a\u0006\bê\u0001\u0010\u008f\u0001R\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b_\u0010\u008d\u0001\u001a\u0006\bë\u0001\u0010\u008f\u0001R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b`\u0010\u008d\u0001\u001a\u0006\bì\u0001\u0010\u008f\u0001R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\ba\u0010\u008d\u0001\u001a\u0006\bí\u0001\u0010\u008f\u0001R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bb\u0010\u008d\u0001\u001a\u0006\bî\u0001\u0010\u008f\u0001R\u001c\u0010c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bc\u0010\u008d\u0001\u001a\u0006\bï\u0001\u0010\u008f\u0001R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bd\u0010\u008d\u0001\u001a\u0006\bð\u0001\u0010\u008f\u0001R\u001c\u0010e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\be\u0010\u008d\u0001\u001a\u0006\bñ\u0001\u0010\u008f\u0001R\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bf\u0010\u008d\u0001\u001a\u0006\bò\u0001\u0010\u008f\u0001R\u001c\u0010g\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bg\u0010\u008d\u0001\u001a\u0006\bó\u0001\u0010\u008f\u0001R\u001c\u0010h\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bh\u0010\u008d\u0001\u001a\u0006\bô\u0001\u0010\u008f\u0001R\u001c\u0010i\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bi\u0010\u008d\u0001\u001a\u0006\bõ\u0001\u0010\u008f\u0001R\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bj\u0010\u008d\u0001\u001a\u0006\bö\u0001\u0010\u008f\u0001R\u001c\u0010k\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bk\u0010\u008d\u0001\u001a\u0006\b÷\u0001\u0010\u008f\u0001R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bl\u0010\u008d\u0001\u001a\u0006\bø\u0001\u0010\u008f\u0001R\u001c\u0010m\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bm\u0010\u008d\u0001\u001a\u0006\bù\u0001\u0010\u008f\u0001R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bn\u0010\u008d\u0001\u001a\u0006\bú\u0001\u0010\u008f\u0001R\u001c\u0010o\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bo\u0010\u008d\u0001\u001a\u0006\bû\u0001\u0010\u008f\u0001R\u001c\u0010p\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bp\u0010\u008d\u0001\u001a\u0006\bü\u0001\u0010\u008f\u0001R\u001c\u0010q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bq\u0010\u008d\u0001\u001a\u0006\bý\u0001\u0010\u008f\u0001R\u001c\u0010r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\br\u0010\u008d\u0001\u001a\u0006\bþ\u0001\u0010\u008f\u0001R\u001c\u0010s\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bs\u0010\u008d\u0001\u001a\u0006\bÿ\u0001\u0010\u008f\u0001R\u001c\u0010t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bt\u0010\u008d\u0001\u001a\u0006\b\u0080\u0002\u0010\u008f\u0001R\u001c\u0010u\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bu\u0010\u008d\u0001\u001a\u0006\b\u0081\u0002\u0010\u008f\u0001R\u001c\u0010v\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bv\u0010\u008d\u0001\u001a\u0006\b\u0082\u0002\u0010\u008f\u0001R\u001c\u0010w\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bw\u0010\u008d\u0001\u001a\u0006\b\u0083\u0002\u0010\u008f\u0001R\u001c\u0010x\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\bx\u0010\u008d\u0001\u001a\u0006\b\u0084\u0002\u0010\u008f\u0001R\u001c\u0010y\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\by\u0010\u008d\u0001\u001a\u0006\b\u0085\u0002\u0010\u008f\u0001¨\u0006\u0088\u0002"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;", "", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;", "battingGamesPlayed", "war", "oWar", "battingPlateAppearances", "battingAtBats", "battingBaseOnBalls", "battingIntentionalWalks", "battingHitByPitch", "battingStrikeOuts", "battingStrikeoutsLooking", "battingStrikeoutsSwinging", "battingAtBatsPerStrikeout", "battingWalkToStrikeoutRatio", "battingWalkRate", "battingHits", "battingSingles", "battingDoubles", "battingTriples", "battingHomeRuns", "battingTotalBases", "battingBabip", "battingRuns", "battingRbi", "battingLeftOnBase", "battingRunsCreated", "battingRunsCreatedPer27Outs", "battingAvg", "battingSluggingPercentage", "battingOnBasePercentage", "battingOps", "battingOpsAdjusted", "battingIsolatedPower", "battingAbPerHomeRun", "battingAtBatsWithRisp", "battingHitsWithRisp", "battingSacFlies", "battingSacBunts", "battingStolenBases", "battingCaughtStealing", "battingStolenBasePercentage", "battingGroundOuts", "battingFlyOuts", "battingLineOuts", "battingPopOuts", "battingLineDrives", "battingGroundBalls", "battingPopUps", "battingFlyBalls", "battingGroundedIntoDoublePlay", "battingFlyIntoDoublePlay", "battingLineIntoDoublePlay", "pitchingWins", "pitchingLosses", "pitchingGamesPlayed", "pitchingGamesStarted", "pitchingGamesFinished", "pitchingQualityStarts", "pitchingGamesCompleted", "pitchingShutouts", "pitchingSaves", "pitchingSaveOpportunities", "pitchingBlownSaves", "pitchingInheritedRunners", "pitchingInheritedRunnersScored", "pitchingInningsPitched", "pitchingBattersFaced", "pitchingNumberOfPitches", "pitchingStrikes", "pitchingPitchesPerInning", "pitchingPitchesPerBatterFaced", "pitchingEarnedRuns", "pitchingEarnedRunsAverage", "pitchingWhip", "pitchingStrikeoutsPer9Inn", "pitchingStrikeoutWalkRatio", "pitchingStrikeOuts", "pitchingGroundOuts", "pitchingBalks", "pitchingWildPitches", "pitchingPickoffs", "pitchingFieldingIndependentPitching", "pitchingHitsAllowed", "pitchingSinglesAllowed", "pitchingDoublesAllowed", "pitchingTriplesAllowed", "pitchingHomeRuns", "pitchingTotalBasesAllowed", "pitchingHitsPer9Inn", "pitchingHomeRunsPer9", "pitchingBaseOnBalls", "pitchingHitByPitch", "pitchingOpponentBattingAvg", "pitchingObp", "pitchingSlg", "pitchingOpsAllowed", "pitchingGroundBallFlyBallRatio", "pitchingGroundBallsAllowed", "pitchingFlyBallsAllowed", "fieldingGamesPlayed", "fieldingGamesStarted", "fieldingGamesFinished", "fieldingGamesCompleted", "fieldingPutOuts", "fieldingAssists", "fieldingTotalErrors", "fieldingDoublePlays", "fieldingChances", "fieldingFielding", "fieldingRangeFactorPerGame", "fieldingInnings", "fieldingThrowingErrors", "fieldingFieldingErrors", "fieldingInterferenceErrors", "fieldingCatcherWildPitches", "fieldingPassedBalls", "fieldingCaughtStealing", "fieldingStolenBasesAllowed", "fieldingStolenBasePercentageAgainst", "fieldingPickoffs", "<init>", "(Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;)V", "", "seen0", "seen1", "seen2", "seen3", "Lt5h;", "serializationConstructorMarker", "(IIIILcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;", "getBattingGamesPlayed", "()Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistic;", "getWar", "getOWar", "getBattingPlateAppearances", "getBattingAtBats", "getBattingBaseOnBalls", "getBattingIntentionalWalks", "getBattingHitByPitch", "getBattingStrikeOuts", "getBattingStrikeoutsLooking", "getBattingStrikeoutsSwinging", "getBattingAtBatsPerStrikeout", "getBattingWalkToStrikeoutRatio", "getBattingWalkRate", "getBattingHits", "getBattingSingles", "getBattingDoubles", "getBattingTriples", "getBattingHomeRuns", "getBattingTotalBases", "getBattingBabip", "getBattingRuns", "getBattingRbi", "getBattingLeftOnBase", "getBattingRunsCreated", "getBattingRunsCreatedPer27Outs", "getBattingAvg", "getBattingSluggingPercentage", "getBattingOnBasePercentage", "getBattingOps", "getBattingOpsAdjusted", "getBattingIsolatedPower", "getBattingAbPerHomeRun", "getBattingAtBatsWithRisp", "getBattingHitsWithRisp", "getBattingSacFlies", "getBattingSacBunts", "getBattingStolenBases", "getBattingCaughtStealing", "getBattingStolenBasePercentage", "getBattingGroundOuts", "getBattingFlyOuts", "getBattingLineOuts", "getBattingPopOuts", "getBattingLineDrives", "getBattingGroundBalls", "getBattingPopUps", "getBattingFlyBalls", "getBattingGroundedIntoDoublePlay", "getBattingFlyIntoDoublePlay", "getBattingLineIntoDoublePlay", "getPitchingWins", "getPitchingLosses", "getPitchingGamesPlayed", "getPitchingGamesStarted", "getPitchingGamesFinished", "getPitchingQualityStarts", "getPitchingGamesCompleted", "getPitchingShutouts", "getPitchingSaves", "getPitchingSaveOpportunities", "getPitchingBlownSaves", "getPitchingInheritedRunners", "getPitchingInheritedRunnersScored", "getPitchingInningsPitched", "getPitchingBattersFaced", "getPitchingNumberOfPitches", "getPitchingStrikes", "getPitchingPitchesPerInning", "getPitchingPitchesPerBatterFaced", "getPitchingEarnedRuns", "getPitchingEarnedRunsAverage", "getPitchingWhip", "getPitchingStrikeoutsPer9Inn", "getPitchingStrikeoutWalkRatio", "getPitchingStrikeOuts", "getPitchingGroundOuts", "getPitchingBalks", "getPitchingWildPitches", "getPitchingPickoffs", "getPitchingFieldingIndependentPitching", "getPitchingHitsAllowed", "getPitchingSinglesAllowed", "getPitchingDoublesAllowed", "getPitchingTriplesAllowed", "getPitchingHomeRuns", "getPitchingTotalBasesAllowed", "getPitchingHitsPer9Inn", "getPitchingHomeRunsPer9", "getPitchingBaseOnBalls", "getPitchingHitByPitch", "getPitchingOpponentBattingAvg", "getPitchingObp", "getPitchingSlg", "getPitchingOpsAllowed", "getPitchingGroundBallFlyBallRatio", "getPitchingGroundBallsAllowed", "getPitchingFlyBallsAllowed", "getFieldingGamesPlayed", "getFieldingGamesStarted", "getFieldingGamesFinished", "getFieldingGamesCompleted", "getFieldingPutOuts", "getFieldingAssists", "getFieldingTotalErrors", "getFieldingDoublePlays", "getFieldingChances", "getFieldingFielding", "getFieldingRangeFactorPerGame", "getFieldingInnings", "getFieldingThrowingErrors", "getFieldingFieldingErrors", "getFieldingInterferenceErrors", "getFieldingCatcherWildPitches", "getFieldingPassedBalls", "getFieldingCaughtStealing", "getFieldingStolenBasesAllowed", "getFieldingStolenBasePercentageAgainst", "getFieldingPickoffs", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballRankedStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseballRankedStatistic battingAbPerHomeRun;

    @Nullable
    private final BaseballRankedStatistic battingAtBats;

    @Nullable
    private final BaseballRankedStatistic battingAtBatsPerStrikeout;

    @Nullable
    private final BaseballRankedStatistic battingAtBatsWithRisp;

    @Nullable
    private final BaseballRankedStatistic battingAvg;

    @Nullable
    private final BaseballRankedStatistic battingBabip;

    @Nullable
    private final BaseballRankedStatistic battingBaseOnBalls;

    @Nullable
    private final BaseballRankedStatistic battingCaughtStealing;

    @Nullable
    private final BaseballRankedStatistic battingDoubles;

    @Nullable
    private final BaseballRankedStatistic battingFlyBalls;

    @Nullable
    private final BaseballRankedStatistic battingFlyIntoDoublePlay;

    @Nullable
    private final BaseballRankedStatistic battingFlyOuts;

    @Nullable
    private final BaseballRankedStatistic battingGamesPlayed;

    @Nullable
    private final BaseballRankedStatistic battingGroundBalls;

    @Nullable
    private final BaseballRankedStatistic battingGroundOuts;

    @Nullable
    private final BaseballRankedStatistic battingGroundedIntoDoublePlay;

    @Nullable
    private final BaseballRankedStatistic battingHitByPitch;

    @Nullable
    private final BaseballRankedStatistic battingHits;

    @Nullable
    private final BaseballRankedStatistic battingHitsWithRisp;

    @Nullable
    private final BaseballRankedStatistic battingHomeRuns;

    @Nullable
    private final BaseballRankedStatistic battingIntentionalWalks;

    @Nullable
    private final BaseballRankedStatistic battingIsolatedPower;

    @Nullable
    private final BaseballRankedStatistic battingLeftOnBase;

    @Nullable
    private final BaseballRankedStatistic battingLineDrives;

    @Nullable
    private final BaseballRankedStatistic battingLineIntoDoublePlay;

    @Nullable
    private final BaseballRankedStatistic battingLineOuts;

    @Nullable
    private final BaseballRankedStatistic battingOnBasePercentage;

    @Nullable
    private final BaseballRankedStatistic battingOps;

    @Nullable
    private final BaseballRankedStatistic battingOpsAdjusted;

    @Nullable
    private final BaseballRankedStatistic battingPlateAppearances;

    @Nullable
    private final BaseballRankedStatistic battingPopOuts;

    @Nullable
    private final BaseballRankedStatistic battingPopUps;

    @Nullable
    private final BaseballRankedStatistic battingRbi;

    @Nullable
    private final BaseballRankedStatistic battingRuns;

    @Nullable
    private final BaseballRankedStatistic battingRunsCreated;

    @Nullable
    private final BaseballRankedStatistic battingRunsCreatedPer27Outs;

    @Nullable
    private final BaseballRankedStatistic battingSacBunts;

    @Nullable
    private final BaseballRankedStatistic battingSacFlies;

    @Nullable
    private final BaseballRankedStatistic battingSingles;

    @Nullable
    private final BaseballRankedStatistic battingSluggingPercentage;

    @Nullable
    private final BaseballRankedStatistic battingStolenBasePercentage;

    @Nullable
    private final BaseballRankedStatistic battingStolenBases;

    @Nullable
    private final BaseballRankedStatistic battingStrikeOuts;

    @Nullable
    private final BaseballRankedStatistic battingStrikeoutsLooking;

    @Nullable
    private final BaseballRankedStatistic battingStrikeoutsSwinging;

    @Nullable
    private final BaseballRankedStatistic battingTotalBases;

    @Nullable
    private final BaseballRankedStatistic battingTriples;

    @Nullable
    private final BaseballRankedStatistic battingWalkRate;

    @Nullable
    private final BaseballRankedStatistic battingWalkToStrikeoutRatio;

    @Nullable
    private final BaseballRankedStatistic fieldingAssists;

    @Nullable
    private final BaseballRankedStatistic fieldingCatcherWildPitches;

    @Nullable
    private final BaseballRankedStatistic fieldingCaughtStealing;

    @Nullable
    private final BaseballRankedStatistic fieldingChances;

    @Nullable
    private final BaseballRankedStatistic fieldingDoublePlays;

    @Nullable
    private final BaseballRankedStatistic fieldingFielding;

    @Nullable
    private final BaseballRankedStatistic fieldingFieldingErrors;

    @Nullable
    private final BaseballRankedStatistic fieldingGamesCompleted;

    @Nullable
    private final BaseballRankedStatistic fieldingGamesFinished;

    @Nullable
    private final BaseballRankedStatistic fieldingGamesPlayed;

    @Nullable
    private final BaseballRankedStatistic fieldingGamesStarted;

    @Nullable
    private final BaseballRankedStatistic fieldingInnings;

    @Nullable
    private final BaseballRankedStatistic fieldingInterferenceErrors;

    @Nullable
    private final BaseballRankedStatistic fieldingPassedBalls;

    @Nullable
    private final BaseballRankedStatistic fieldingPickoffs;

    @Nullable
    private final BaseballRankedStatistic fieldingPutOuts;

    @Nullable
    private final BaseballRankedStatistic fieldingRangeFactorPerGame;

    @Nullable
    private final BaseballRankedStatistic fieldingStolenBasePercentageAgainst;

    @Nullable
    private final BaseballRankedStatistic fieldingStolenBasesAllowed;

    @Nullable
    private final BaseballRankedStatistic fieldingThrowingErrors;

    @Nullable
    private final BaseballRankedStatistic fieldingTotalErrors;

    @Nullable
    private final BaseballRankedStatistic oWar;

    @Nullable
    private final BaseballRankedStatistic pitchingBalks;

    @Nullable
    private final BaseballRankedStatistic pitchingBaseOnBalls;

    @Nullable
    private final BaseballRankedStatistic pitchingBattersFaced;

    @Nullable
    private final BaseballRankedStatistic pitchingBlownSaves;

    @Nullable
    private final BaseballRankedStatistic pitchingDoublesAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingEarnedRuns;

    @Nullable
    private final BaseballRankedStatistic pitchingEarnedRunsAverage;

    @Nullable
    private final BaseballRankedStatistic pitchingFieldingIndependentPitching;

    @Nullable
    private final BaseballRankedStatistic pitchingFlyBallsAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingGamesCompleted;

    @Nullable
    private final BaseballRankedStatistic pitchingGamesFinished;

    @Nullable
    private final BaseballRankedStatistic pitchingGamesPlayed;

    @Nullable
    private final BaseballRankedStatistic pitchingGamesStarted;

    @Nullable
    private final BaseballRankedStatistic pitchingGroundBallFlyBallRatio;

    @Nullable
    private final BaseballRankedStatistic pitchingGroundBallsAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingGroundOuts;

    @Nullable
    private final BaseballRankedStatistic pitchingHitByPitch;

    @Nullable
    private final BaseballRankedStatistic pitchingHitsAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingHitsPer9Inn;

    @Nullable
    private final BaseballRankedStatistic pitchingHomeRuns;

    @Nullable
    private final BaseballRankedStatistic pitchingHomeRunsPer9;

    @Nullable
    private final BaseballRankedStatistic pitchingInheritedRunners;

    @Nullable
    private final BaseballRankedStatistic pitchingInheritedRunnersScored;

    @Nullable
    private final BaseballRankedStatistic pitchingInningsPitched;

    @Nullable
    private final BaseballRankedStatistic pitchingLosses;

    @Nullable
    private final BaseballRankedStatistic pitchingNumberOfPitches;

    @Nullable
    private final BaseballRankedStatistic pitchingObp;

    @Nullable
    private final BaseballRankedStatistic pitchingOpponentBattingAvg;

    @Nullable
    private final BaseballRankedStatistic pitchingOpsAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingPickoffs;

    @Nullable
    private final BaseballRankedStatistic pitchingPitchesPerBatterFaced;

    @Nullable
    private final BaseballRankedStatistic pitchingPitchesPerInning;

    @Nullable
    private final BaseballRankedStatistic pitchingQualityStarts;

    @Nullable
    private final BaseballRankedStatistic pitchingSaveOpportunities;

    @Nullable
    private final BaseballRankedStatistic pitchingSaves;

    @Nullable
    private final BaseballRankedStatistic pitchingShutouts;

    @Nullable
    private final BaseballRankedStatistic pitchingSinglesAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingSlg;

    @Nullable
    private final BaseballRankedStatistic pitchingStrikeOuts;

    @Nullable
    private final BaseballRankedStatistic pitchingStrikeoutWalkRatio;

    @Nullable
    private final BaseballRankedStatistic pitchingStrikeoutsPer9Inn;

    @Nullable
    private final BaseballRankedStatistic pitchingStrikes;

    @Nullable
    private final BaseballRankedStatistic pitchingTotalBasesAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingTriplesAllowed;

    @Nullable
    private final BaseballRankedStatistic pitchingWhip;

    @Nullable
    private final BaseballRankedStatistic pitchingWildPitches;

    @Nullable
    private final BaseballRankedStatistic pitchingWins;

    @Nullable
    private final BaseballRankedStatistic war;

    public /* synthetic */ BaseballRankedStatistics(int i, int i2, int i3, int i4, BaseballRankedStatistic baseballRankedStatistic, BaseballRankedStatistic baseballRankedStatistic2, BaseballRankedStatistic baseballRankedStatistic3, BaseballRankedStatistic baseballRankedStatistic4, BaseballRankedStatistic baseballRankedStatistic5, BaseballRankedStatistic baseballRankedStatistic6, BaseballRankedStatistic baseballRankedStatistic7, BaseballRankedStatistic baseballRankedStatistic8, BaseballRankedStatistic baseballRankedStatistic9, BaseballRankedStatistic baseballRankedStatistic10, BaseballRankedStatistic baseballRankedStatistic11, BaseballRankedStatistic baseballRankedStatistic12, BaseballRankedStatistic baseballRankedStatistic13, BaseballRankedStatistic baseballRankedStatistic14, BaseballRankedStatistic baseballRankedStatistic15, BaseballRankedStatistic baseballRankedStatistic16, BaseballRankedStatistic baseballRankedStatistic17, BaseballRankedStatistic baseballRankedStatistic18, BaseballRankedStatistic baseballRankedStatistic19, BaseballRankedStatistic baseballRankedStatistic20, BaseballRankedStatistic baseballRankedStatistic21, BaseballRankedStatistic baseballRankedStatistic22, BaseballRankedStatistic baseballRankedStatistic23, BaseballRankedStatistic baseballRankedStatistic24, BaseballRankedStatistic baseballRankedStatistic25, BaseballRankedStatistic baseballRankedStatistic26, BaseballRankedStatistic baseballRankedStatistic27, BaseballRankedStatistic baseballRankedStatistic28, BaseballRankedStatistic baseballRankedStatistic29, BaseballRankedStatistic baseballRankedStatistic30, BaseballRankedStatistic baseballRankedStatistic31, BaseballRankedStatistic baseballRankedStatistic32, BaseballRankedStatistic baseballRankedStatistic33, BaseballRankedStatistic baseballRankedStatistic34, BaseballRankedStatistic baseballRankedStatistic35, BaseballRankedStatistic baseballRankedStatistic36, BaseballRankedStatistic baseballRankedStatistic37, BaseballRankedStatistic baseballRankedStatistic38, BaseballRankedStatistic baseballRankedStatistic39, BaseballRankedStatistic baseballRankedStatistic40, BaseballRankedStatistic baseballRankedStatistic41, BaseballRankedStatistic baseballRankedStatistic42, BaseballRankedStatistic baseballRankedStatistic43, BaseballRankedStatistic baseballRankedStatistic44, BaseballRankedStatistic baseballRankedStatistic45, BaseballRankedStatistic baseballRankedStatistic46, BaseballRankedStatistic baseballRankedStatistic47, BaseballRankedStatistic baseballRankedStatistic48, BaseballRankedStatistic baseballRankedStatistic49, BaseballRankedStatistic baseballRankedStatistic50, BaseballRankedStatistic baseballRankedStatistic51, BaseballRankedStatistic baseballRankedStatistic52, BaseballRankedStatistic baseballRankedStatistic53, BaseballRankedStatistic baseballRankedStatistic54, BaseballRankedStatistic baseballRankedStatistic55, BaseballRankedStatistic baseballRankedStatistic56, BaseballRankedStatistic baseballRankedStatistic57, BaseballRankedStatistic baseballRankedStatistic58, BaseballRankedStatistic baseballRankedStatistic59, BaseballRankedStatistic baseballRankedStatistic60, BaseballRankedStatistic baseballRankedStatistic61, BaseballRankedStatistic baseballRankedStatistic62, BaseballRankedStatistic baseballRankedStatistic63, BaseballRankedStatistic baseballRankedStatistic64, BaseballRankedStatistic baseballRankedStatistic65, BaseballRankedStatistic baseballRankedStatistic66, BaseballRankedStatistic baseballRankedStatistic67, BaseballRankedStatistic baseballRankedStatistic68, BaseballRankedStatistic baseballRankedStatistic69, BaseballRankedStatistic baseballRankedStatistic70, BaseballRankedStatistic baseballRankedStatistic71, BaseballRankedStatistic baseballRankedStatistic72, BaseballRankedStatistic baseballRankedStatistic73, BaseballRankedStatistic baseballRankedStatistic74, BaseballRankedStatistic baseballRankedStatistic75, BaseballRankedStatistic baseballRankedStatistic76, BaseballRankedStatistic baseballRankedStatistic77, BaseballRankedStatistic baseballRankedStatistic78, BaseballRankedStatistic baseballRankedStatistic79, BaseballRankedStatistic baseballRankedStatistic80, BaseballRankedStatistic baseballRankedStatistic81, BaseballRankedStatistic baseballRankedStatistic82, BaseballRankedStatistic baseballRankedStatistic83, BaseballRankedStatistic baseballRankedStatistic84, BaseballRankedStatistic baseballRankedStatistic85, BaseballRankedStatistic baseballRankedStatistic86, BaseballRankedStatistic baseballRankedStatistic87, BaseballRankedStatistic baseballRankedStatistic88, BaseballRankedStatistic baseballRankedStatistic89, BaseballRankedStatistic baseballRankedStatistic90, BaseballRankedStatistic baseballRankedStatistic91, BaseballRankedStatistic baseballRankedStatistic92, BaseballRankedStatistic baseballRankedStatistic93, BaseballRankedStatistic baseballRankedStatistic94, BaseballRankedStatistic baseballRankedStatistic95, BaseballRankedStatistic baseballRankedStatistic96, BaseballRankedStatistic baseballRankedStatistic97, BaseballRankedStatistic baseballRankedStatistic98, BaseballRankedStatistic baseballRankedStatistic99, BaseballRankedStatistic baseballRankedStatistic100, BaseballRankedStatistic baseballRankedStatistic101, BaseballRankedStatistic baseballRankedStatistic102, BaseballRankedStatistic baseballRankedStatistic103, BaseballRankedStatistic baseballRankedStatistic104, BaseballRankedStatistic baseballRankedStatistic105, BaseballRankedStatistic baseballRankedStatistic106, BaseballRankedStatistic baseballRankedStatistic107, BaseballRankedStatistic baseballRankedStatistic108, BaseballRankedStatistic baseballRankedStatistic109, BaseballRankedStatistic baseballRankedStatistic110, BaseballRankedStatistic baseballRankedStatistic111, BaseballRankedStatistic baseballRankedStatistic112, BaseballRankedStatistic baseballRankedStatistic113, BaseballRankedStatistic baseballRankedStatistic114, BaseballRankedStatistic baseballRankedStatistic115, BaseballRankedStatistic baseballRankedStatistic116, BaseballRankedStatistic baseballRankedStatistic117, BaseballRankedStatistic baseballRankedStatistic118, BaseballRankedStatistic baseballRankedStatistic119, t5h t5hVar) {
        if ((8388607 != (i4 & 8388607)) || (((-1 != i) | (-1 != i2)) | (-1 != i3))) {
            oea.y(new int[]{i, i2, i3, i4}, new int[]{-1, -1, -1, 8388607}, BaseballRankedStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.battingGamesPlayed = baseballRankedStatistic;
        this.war = baseballRankedStatistic2;
        this.oWar = baseballRankedStatistic3;
        this.battingPlateAppearances = baseballRankedStatistic4;
        this.battingAtBats = baseballRankedStatistic5;
        this.battingBaseOnBalls = baseballRankedStatistic6;
        this.battingIntentionalWalks = baseballRankedStatistic7;
        this.battingHitByPitch = baseballRankedStatistic8;
        this.battingStrikeOuts = baseballRankedStatistic9;
        this.battingStrikeoutsLooking = baseballRankedStatistic10;
        this.battingStrikeoutsSwinging = baseballRankedStatistic11;
        this.battingAtBatsPerStrikeout = baseballRankedStatistic12;
        this.battingWalkToStrikeoutRatio = baseballRankedStatistic13;
        this.battingWalkRate = baseballRankedStatistic14;
        this.battingHits = baseballRankedStatistic15;
        this.battingSingles = baseballRankedStatistic16;
        this.battingDoubles = baseballRankedStatistic17;
        this.battingTriples = baseballRankedStatistic18;
        this.battingHomeRuns = baseballRankedStatistic19;
        this.battingTotalBases = baseballRankedStatistic20;
        this.battingBabip = baseballRankedStatistic21;
        this.battingRuns = baseballRankedStatistic22;
        this.battingRbi = baseballRankedStatistic23;
        this.battingLeftOnBase = baseballRankedStatistic24;
        this.battingRunsCreated = baseballRankedStatistic25;
        this.battingRunsCreatedPer27Outs = baseballRankedStatistic26;
        this.battingAvg = baseballRankedStatistic27;
        this.battingSluggingPercentage = baseballRankedStatistic28;
        this.battingOnBasePercentage = baseballRankedStatistic29;
        this.battingOps = baseballRankedStatistic30;
        this.battingOpsAdjusted = baseballRankedStatistic31;
        this.battingIsolatedPower = baseballRankedStatistic32;
        this.battingAbPerHomeRun = baseballRankedStatistic33;
        this.battingAtBatsWithRisp = baseballRankedStatistic34;
        this.battingHitsWithRisp = baseballRankedStatistic35;
        this.battingSacFlies = baseballRankedStatistic36;
        this.battingSacBunts = baseballRankedStatistic37;
        this.battingStolenBases = baseballRankedStatistic38;
        this.battingCaughtStealing = baseballRankedStatistic39;
        this.battingStolenBasePercentage = baseballRankedStatistic40;
        this.battingGroundOuts = baseballRankedStatistic41;
        this.battingFlyOuts = baseballRankedStatistic42;
        this.battingLineOuts = baseballRankedStatistic43;
        this.battingPopOuts = baseballRankedStatistic44;
        this.battingLineDrives = baseballRankedStatistic45;
        this.battingGroundBalls = baseballRankedStatistic46;
        this.battingPopUps = baseballRankedStatistic47;
        this.battingFlyBalls = baseballRankedStatistic48;
        this.battingGroundedIntoDoublePlay = baseballRankedStatistic49;
        this.battingFlyIntoDoublePlay = baseballRankedStatistic50;
        this.battingLineIntoDoublePlay = baseballRankedStatistic51;
        this.pitchingWins = baseballRankedStatistic52;
        this.pitchingLosses = baseballRankedStatistic53;
        this.pitchingGamesPlayed = baseballRankedStatistic54;
        this.pitchingGamesStarted = baseballRankedStatistic55;
        this.pitchingGamesFinished = baseballRankedStatistic56;
        this.pitchingQualityStarts = baseballRankedStatistic57;
        this.pitchingGamesCompleted = baseballRankedStatistic58;
        this.pitchingShutouts = baseballRankedStatistic59;
        this.pitchingSaves = baseballRankedStatistic60;
        this.pitchingSaveOpportunities = baseballRankedStatistic61;
        this.pitchingBlownSaves = baseballRankedStatistic62;
        this.pitchingInheritedRunners = baseballRankedStatistic63;
        this.pitchingInheritedRunnersScored = baseballRankedStatistic64;
        this.pitchingInningsPitched = baseballRankedStatistic65;
        this.pitchingBattersFaced = baseballRankedStatistic66;
        this.pitchingNumberOfPitches = baseballRankedStatistic67;
        this.pitchingStrikes = baseballRankedStatistic68;
        this.pitchingPitchesPerInning = baseballRankedStatistic69;
        this.pitchingPitchesPerBatterFaced = baseballRankedStatistic70;
        this.pitchingEarnedRuns = baseballRankedStatistic71;
        this.pitchingEarnedRunsAverage = baseballRankedStatistic72;
        this.pitchingWhip = baseballRankedStatistic73;
        this.pitchingStrikeoutsPer9Inn = baseballRankedStatistic74;
        this.pitchingStrikeoutWalkRatio = baseballRankedStatistic75;
        this.pitchingStrikeOuts = baseballRankedStatistic76;
        this.pitchingGroundOuts = baseballRankedStatistic77;
        this.pitchingBalks = baseballRankedStatistic78;
        this.pitchingWildPitches = baseballRankedStatistic79;
        this.pitchingPickoffs = baseballRankedStatistic80;
        this.pitchingFieldingIndependentPitching = baseballRankedStatistic81;
        this.pitchingHitsAllowed = baseballRankedStatistic82;
        this.pitchingSinglesAllowed = baseballRankedStatistic83;
        this.pitchingDoublesAllowed = baseballRankedStatistic84;
        this.pitchingTriplesAllowed = baseballRankedStatistic85;
        this.pitchingHomeRuns = baseballRankedStatistic86;
        this.pitchingTotalBasesAllowed = baseballRankedStatistic87;
        this.pitchingHitsPer9Inn = baseballRankedStatistic88;
        this.pitchingHomeRunsPer9 = baseballRankedStatistic89;
        this.pitchingBaseOnBalls = baseballRankedStatistic90;
        this.pitchingHitByPitch = baseballRankedStatistic91;
        this.pitchingOpponentBattingAvg = baseballRankedStatistic92;
        this.pitchingObp = baseballRankedStatistic93;
        this.pitchingSlg = baseballRankedStatistic94;
        this.pitchingOpsAllowed = baseballRankedStatistic95;
        this.pitchingGroundBallFlyBallRatio = baseballRankedStatistic96;
        this.pitchingGroundBallsAllowed = baseballRankedStatistic97;
        this.pitchingFlyBallsAllowed = baseballRankedStatistic98;
        this.fieldingGamesPlayed = baseballRankedStatistic99;
        this.fieldingGamesStarted = baseballRankedStatistic100;
        this.fieldingGamesFinished = baseballRankedStatistic101;
        this.fieldingGamesCompleted = baseballRankedStatistic102;
        this.fieldingPutOuts = baseballRankedStatistic103;
        this.fieldingAssists = baseballRankedStatistic104;
        this.fieldingTotalErrors = baseballRankedStatistic105;
        this.fieldingDoublePlays = baseballRankedStatistic106;
        this.fieldingChances = baseballRankedStatistic107;
        this.fieldingFielding = baseballRankedStatistic108;
        this.fieldingRangeFactorPerGame = baseballRankedStatistic109;
        this.fieldingInnings = baseballRankedStatistic110;
        this.fieldingThrowingErrors = baseballRankedStatistic111;
        this.fieldingFieldingErrors = baseballRankedStatistic112;
        this.fieldingInterferenceErrors = baseballRankedStatistic113;
        this.fieldingCatcherWildPitches = baseballRankedStatistic114;
        this.fieldingPassedBalls = baseballRankedStatistic115;
        this.fieldingCaughtStealing = baseballRankedStatistic116;
        this.fieldingStolenBasesAllowed = baseballRankedStatistic117;
        this.fieldingStolenBasePercentageAgainst = baseballRankedStatistic118;
        this.fieldingPickoffs = baseballRankedStatistic119;
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballRankedStatistics self, wf3 output, SerialDescriptor serialDesc) {
        BaseballRankedStatistic$$serializer baseballRankedStatistic$$serializer = BaseballRankedStatistic$$serializer.INSTANCE;
        output.h(serialDesc, 0, baseballRankedStatistic$$serializer, self.battingGamesPlayed);
        output.h(serialDesc, 1, baseballRankedStatistic$$serializer, self.war);
        output.h(serialDesc, 2, baseballRankedStatistic$$serializer, self.oWar);
        output.h(serialDesc, 3, baseballRankedStatistic$$serializer, self.battingPlateAppearances);
        output.h(serialDesc, 4, baseballRankedStatistic$$serializer, self.battingAtBats);
        output.h(serialDesc, 5, baseballRankedStatistic$$serializer, self.battingBaseOnBalls);
        output.h(serialDesc, 6, baseballRankedStatistic$$serializer, self.battingIntentionalWalks);
        output.h(serialDesc, 7, baseballRankedStatistic$$serializer, self.battingHitByPitch);
        output.h(serialDesc, 8, baseballRankedStatistic$$serializer, self.battingStrikeOuts);
        output.h(serialDesc, 9, baseballRankedStatistic$$serializer, self.battingStrikeoutsLooking);
        output.h(serialDesc, 10, baseballRankedStatistic$$serializer, self.battingStrikeoutsSwinging);
        output.h(serialDesc, 11, baseballRankedStatistic$$serializer, self.battingAtBatsPerStrikeout);
        output.h(serialDesc, 12, baseballRankedStatistic$$serializer, self.battingWalkToStrikeoutRatio);
        output.h(serialDesc, 13, baseballRankedStatistic$$serializer, self.battingWalkRate);
        output.h(serialDesc, 14, baseballRankedStatistic$$serializer, self.battingHits);
        output.h(serialDesc, 15, baseballRankedStatistic$$serializer, self.battingSingles);
        output.h(serialDesc, 16, baseballRankedStatistic$$serializer, self.battingDoubles);
        output.h(serialDesc, 17, baseballRankedStatistic$$serializer, self.battingTriples);
        output.h(serialDesc, 18, baseballRankedStatistic$$serializer, self.battingHomeRuns);
        output.h(serialDesc, 19, baseballRankedStatistic$$serializer, self.battingTotalBases);
        output.h(serialDesc, 20, baseballRankedStatistic$$serializer, self.battingBabip);
        output.h(serialDesc, 21, baseballRankedStatistic$$serializer, self.battingRuns);
        output.h(serialDesc, 22, baseballRankedStatistic$$serializer, self.battingRbi);
        output.h(serialDesc, 23, baseballRankedStatistic$$serializer, self.battingLeftOnBase);
        output.h(serialDesc, 24, baseballRankedStatistic$$serializer, self.battingRunsCreated);
        output.h(serialDesc, 25, baseballRankedStatistic$$serializer, self.battingRunsCreatedPer27Outs);
        output.h(serialDesc, 26, baseballRankedStatistic$$serializer, self.battingAvg);
        output.h(serialDesc, 27, baseballRankedStatistic$$serializer, self.battingSluggingPercentage);
        output.h(serialDesc, 28, baseballRankedStatistic$$serializer, self.battingOnBasePercentage);
        output.h(serialDesc, 29, baseballRankedStatistic$$serializer, self.battingOps);
        output.h(serialDesc, 30, baseballRankedStatistic$$serializer, self.battingOpsAdjusted);
        output.h(serialDesc, 31, baseballRankedStatistic$$serializer, self.battingIsolatedPower);
        output.h(serialDesc, 32, baseballRankedStatistic$$serializer, self.battingAbPerHomeRun);
        output.h(serialDesc, 33, baseballRankedStatistic$$serializer, self.battingAtBatsWithRisp);
        output.h(serialDesc, 34, baseballRankedStatistic$$serializer, self.battingHitsWithRisp);
        output.h(serialDesc, 35, baseballRankedStatistic$$serializer, self.battingSacFlies);
        output.h(serialDesc, 36, baseballRankedStatistic$$serializer, self.battingSacBunts);
        output.h(serialDesc, 37, baseballRankedStatistic$$serializer, self.battingStolenBases);
        output.h(serialDesc, 38, baseballRankedStatistic$$serializer, self.battingCaughtStealing);
        output.h(serialDesc, 39, baseballRankedStatistic$$serializer, self.battingStolenBasePercentage);
        output.h(serialDesc, 40, baseballRankedStatistic$$serializer, self.battingGroundOuts);
        output.h(serialDesc, 41, baseballRankedStatistic$$serializer, self.battingFlyOuts);
        output.h(serialDesc, 42, baseballRankedStatistic$$serializer, self.battingLineOuts);
        output.h(serialDesc, 43, baseballRankedStatistic$$serializer, self.battingPopOuts);
        output.h(serialDesc, 44, baseballRankedStatistic$$serializer, self.battingLineDrives);
        output.h(serialDesc, 45, baseballRankedStatistic$$serializer, self.battingGroundBalls);
        output.h(serialDesc, 46, baseballRankedStatistic$$serializer, self.battingPopUps);
        output.h(serialDesc, 47, baseballRankedStatistic$$serializer, self.battingFlyBalls);
        output.h(serialDesc, 48, baseballRankedStatistic$$serializer, self.battingGroundedIntoDoublePlay);
        output.h(serialDesc, 49, baseballRankedStatistic$$serializer, self.battingFlyIntoDoublePlay);
        output.h(serialDesc, 50, baseballRankedStatistic$$serializer, self.battingLineIntoDoublePlay);
        output.h(serialDesc, 51, baseballRankedStatistic$$serializer, self.pitchingWins);
        output.h(serialDesc, 52, baseballRankedStatistic$$serializer, self.pitchingLosses);
        output.h(serialDesc, 53, baseballRankedStatistic$$serializer, self.pitchingGamesPlayed);
        output.h(serialDesc, 54, baseballRankedStatistic$$serializer, self.pitchingGamesStarted);
        output.h(serialDesc, 55, baseballRankedStatistic$$serializer, self.pitchingGamesFinished);
        output.h(serialDesc, 56, baseballRankedStatistic$$serializer, self.pitchingQualityStarts);
        output.h(serialDesc, 57, baseballRankedStatistic$$serializer, self.pitchingGamesCompleted);
        output.h(serialDesc, 58, baseballRankedStatistic$$serializer, self.pitchingShutouts);
        output.h(serialDesc, 59, baseballRankedStatistic$$serializer, self.pitchingSaves);
        output.h(serialDesc, 60, baseballRankedStatistic$$serializer, self.pitchingSaveOpportunities);
        output.h(serialDesc, 61, baseballRankedStatistic$$serializer, self.pitchingBlownSaves);
        output.h(serialDesc, 62, baseballRankedStatistic$$serializer, self.pitchingInheritedRunners);
        output.h(serialDesc, 63, baseballRankedStatistic$$serializer, self.pitchingInheritedRunnersScored);
        output.h(serialDesc, 64, baseballRankedStatistic$$serializer, self.pitchingInningsPitched);
        output.h(serialDesc, 65, baseballRankedStatistic$$serializer, self.pitchingBattersFaced);
        output.h(serialDesc, 66, baseballRankedStatistic$$serializer, self.pitchingNumberOfPitches);
        output.h(serialDesc, 67, baseballRankedStatistic$$serializer, self.pitchingStrikes);
        output.h(serialDesc, 68, baseballRankedStatistic$$serializer, self.pitchingPitchesPerInning);
        output.h(serialDesc, 69, baseballRankedStatistic$$serializer, self.pitchingPitchesPerBatterFaced);
        output.h(serialDesc, 70, baseballRankedStatistic$$serializer, self.pitchingEarnedRuns);
        output.h(serialDesc, 71, baseballRankedStatistic$$serializer, self.pitchingEarnedRunsAverage);
        output.h(serialDesc, 72, baseballRankedStatistic$$serializer, self.pitchingWhip);
        output.h(serialDesc, 73, baseballRankedStatistic$$serializer, self.pitchingStrikeoutsPer9Inn);
        output.h(serialDesc, 74, baseballRankedStatistic$$serializer, self.pitchingStrikeoutWalkRatio);
        output.h(serialDesc, 75, baseballRankedStatistic$$serializer, self.pitchingStrikeOuts);
        output.h(serialDesc, 76, baseballRankedStatistic$$serializer, self.pitchingGroundOuts);
        output.h(serialDesc, 77, baseballRankedStatistic$$serializer, self.pitchingBalks);
        output.h(serialDesc, 78, baseballRankedStatistic$$serializer, self.pitchingWildPitches);
        output.h(serialDesc, 79, baseballRankedStatistic$$serializer, self.pitchingPickoffs);
        output.h(serialDesc, 80, baseballRankedStatistic$$serializer, self.pitchingFieldingIndependentPitching);
        output.h(serialDesc, 81, baseballRankedStatistic$$serializer, self.pitchingHitsAllowed);
        output.h(serialDesc, 82, baseballRankedStatistic$$serializer, self.pitchingSinglesAllowed);
        output.h(serialDesc, 83, baseballRankedStatistic$$serializer, self.pitchingDoublesAllowed);
        output.h(serialDesc, 84, baseballRankedStatistic$$serializer, self.pitchingTriplesAllowed);
        output.h(serialDesc, 85, baseballRankedStatistic$$serializer, self.pitchingHomeRuns);
        output.h(serialDesc, 86, baseballRankedStatistic$$serializer, self.pitchingTotalBasesAllowed);
        output.h(serialDesc, 87, baseballRankedStatistic$$serializer, self.pitchingHitsPer9Inn);
        output.h(serialDesc, 88, baseballRankedStatistic$$serializer, self.pitchingHomeRunsPer9);
        output.h(serialDesc, 89, baseballRankedStatistic$$serializer, self.pitchingBaseOnBalls);
        output.h(serialDesc, 90, baseballRankedStatistic$$serializer, self.pitchingHitByPitch);
        output.h(serialDesc, 91, baseballRankedStatistic$$serializer, self.pitchingOpponentBattingAvg);
        output.h(serialDesc, 92, baseballRankedStatistic$$serializer, self.pitchingObp);
        output.h(serialDesc, 93, baseballRankedStatistic$$serializer, self.pitchingSlg);
        output.h(serialDesc, 94, baseballRankedStatistic$$serializer, self.pitchingOpsAllowed);
        output.h(serialDesc, 95, baseballRankedStatistic$$serializer, self.pitchingGroundBallFlyBallRatio);
        output.h(serialDesc, 96, baseballRankedStatistic$$serializer, self.pitchingGroundBallsAllowed);
        output.h(serialDesc, 97, baseballRankedStatistic$$serializer, self.pitchingFlyBallsAllowed);
        output.h(serialDesc, 98, baseballRankedStatistic$$serializer, self.fieldingGamesPlayed);
        output.h(serialDesc, 99, baseballRankedStatistic$$serializer, self.fieldingGamesStarted);
        output.h(serialDesc, 100, baseballRankedStatistic$$serializer, self.fieldingGamesFinished);
        output.h(serialDesc, 101, baseballRankedStatistic$$serializer, self.fieldingGamesCompleted);
        output.h(serialDesc, 102, baseballRankedStatistic$$serializer, self.fieldingPutOuts);
        output.h(serialDesc, 103, baseballRankedStatistic$$serializer, self.fieldingAssists);
        output.h(serialDesc, 104, baseballRankedStatistic$$serializer, self.fieldingTotalErrors);
        output.h(serialDesc, 105, baseballRankedStatistic$$serializer, self.fieldingDoublePlays);
        output.h(serialDesc, 106, baseballRankedStatistic$$serializer, self.fieldingChances);
        output.h(serialDesc, 107, baseballRankedStatistic$$serializer, self.fieldingFielding);
        output.h(serialDesc, 108, baseballRankedStatistic$$serializer, self.fieldingRangeFactorPerGame);
        output.h(serialDesc, 109, baseballRankedStatistic$$serializer, self.fieldingInnings);
        output.h(serialDesc, 110, baseballRankedStatistic$$serializer, self.fieldingThrowingErrors);
        output.h(serialDesc, 111, baseballRankedStatistic$$serializer, self.fieldingFieldingErrors);
        output.h(serialDesc, 112, baseballRankedStatistic$$serializer, self.fieldingInterferenceErrors);
        output.h(serialDesc, 113, baseballRankedStatistic$$serializer, self.fieldingCatcherWildPitches);
        output.h(serialDesc, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, baseballRankedStatistic$$serializer, self.fieldingPassedBalls);
        output.h(serialDesc, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, baseballRankedStatistic$$serializer, self.fieldingCaughtStealing);
        output.h(serialDesc, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, baseballRankedStatistic$$serializer, self.fieldingStolenBasesAllowed);
        output.h(serialDesc, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, baseballRankedStatistic$$serializer, self.fieldingStolenBasePercentageAgainst);
        output.h(serialDesc, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, baseballRankedStatistic$$serializer, self.fieldingPickoffs);
    }

    @Nullable
    public final BaseballRankedStatistic getBattingAbPerHomeRun() {
        return this.battingAbPerHomeRun;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingAtBats() {
        return this.battingAtBats;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingAtBatsPerStrikeout() {
        return this.battingAtBatsPerStrikeout;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingAtBatsWithRisp() {
        return this.battingAtBatsWithRisp;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingAvg() {
        return this.battingAvg;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingBabip() {
        return this.battingBabip;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingBaseOnBalls() {
        return this.battingBaseOnBalls;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingCaughtStealing() {
        return this.battingCaughtStealing;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingDoubles() {
        return this.battingDoubles;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingFlyBalls() {
        return this.battingFlyBalls;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingFlyIntoDoublePlay() {
        return this.battingFlyIntoDoublePlay;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingFlyOuts() {
        return this.battingFlyOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingGamesPlayed() {
        return this.battingGamesPlayed;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingGroundBalls() {
        return this.battingGroundBalls;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingGroundOuts() {
        return this.battingGroundOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingGroundedIntoDoublePlay() {
        return this.battingGroundedIntoDoublePlay;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingHitByPitch() {
        return this.battingHitByPitch;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingHits() {
        return this.battingHits;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingHitsWithRisp() {
        return this.battingHitsWithRisp;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingIntentionalWalks() {
        return this.battingIntentionalWalks;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingIsolatedPower() {
        return this.battingIsolatedPower;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingLeftOnBase() {
        return this.battingLeftOnBase;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingLineDrives() {
        return this.battingLineDrives;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingLineIntoDoublePlay() {
        return this.battingLineIntoDoublePlay;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingLineOuts() {
        return this.battingLineOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingOnBasePercentage() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingOps() {
        return this.battingOps;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingOpsAdjusted() {
        return this.battingOpsAdjusted;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingPlateAppearances() {
        return this.battingPlateAppearances;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingPopOuts() {
        return this.battingPopOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingPopUps() {
        return this.battingPopUps;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingRbi() {
        return this.battingRbi;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingRuns() {
        return this.battingRuns;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingRunsCreated() {
        return this.battingRunsCreated;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingRunsCreatedPer27Outs() {
        return this.battingRunsCreatedPer27Outs;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingSacBunts() {
        return this.battingSacBunts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingSacFlies() {
        return this.battingSacFlies;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingSingles() {
        return this.battingSingles;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingSluggingPercentage() {
        return this.battingSluggingPercentage;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingStolenBasePercentage() {
        return this.battingStolenBasePercentage;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingStolenBases() {
        return this.battingStolenBases;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingStrikeOuts() {
        return this.battingStrikeOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingStrikeoutsLooking() {
        return this.battingStrikeoutsLooking;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingStrikeoutsSwinging() {
        return this.battingStrikeoutsSwinging;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingTotalBases() {
        return this.battingTotalBases;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingTriples() {
        return this.battingTriples;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingWalkRate() {
        return this.battingWalkRate;
    }

    @Nullable
    public final BaseballRankedStatistic getBattingWalkToStrikeoutRatio() {
        return this.battingWalkToStrikeoutRatio;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingAssists() {
        return this.fieldingAssists;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingCatcherWildPitches() {
        return this.fieldingCatcherWildPitches;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingCaughtStealing() {
        return this.fieldingCaughtStealing;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingChances() {
        return this.fieldingChances;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingDoublePlays() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingFielding() {
        return this.fieldingFielding;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingFieldingErrors() {
        return this.fieldingFieldingErrors;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingGamesCompleted() {
        return this.fieldingGamesCompleted;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingGamesFinished() {
        return this.fieldingGamesFinished;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingGamesPlayed() {
        return this.fieldingGamesPlayed;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingGamesStarted() {
        return this.fieldingGamesStarted;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingInnings() {
        return this.fieldingInnings;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingInterferenceErrors() {
        return this.fieldingInterferenceErrors;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingPassedBalls() {
        return this.fieldingPassedBalls;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingPickoffs() {
        return this.fieldingPickoffs;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingPutOuts() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingRangeFactorPerGame() {
        return this.fieldingRangeFactorPerGame;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingStolenBasePercentageAgainst() {
        return this.fieldingStolenBasePercentageAgainst;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingStolenBasesAllowed() {
        return this.fieldingStolenBasesAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingThrowingErrors() {
        return this.fieldingThrowingErrors;
    }

    @Nullable
    public final BaseballRankedStatistic getFieldingTotalErrors() {
        return this.fieldingTotalErrors;
    }

    @Nullable
    public final BaseballRankedStatistic getOWar() {
        return this.oWar;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingBalks() {
        return this.pitchingBalks;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingBaseOnBalls() {
        return this.pitchingBaseOnBalls;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingBattersFaced() {
        return this.pitchingBattersFaced;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingBlownSaves() {
        return this.pitchingBlownSaves;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingDoublesAllowed() {
        return this.pitchingDoublesAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingEarnedRuns() {
        return this.pitchingEarnedRuns;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingEarnedRunsAverage() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingFieldingIndependentPitching() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingFlyBallsAllowed() {
        return this.pitchingFlyBallsAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGamesCompleted() {
        return this.pitchingGamesCompleted;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGamesFinished() {
        return this.pitchingGamesFinished;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGamesPlayed() {
        return this.pitchingGamesPlayed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGamesStarted() {
        return this.pitchingGamesStarted;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGroundBallFlyBallRatio() {
        return this.pitchingGroundBallFlyBallRatio;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGroundBallsAllowed() {
        return this.pitchingGroundBallsAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingGroundOuts() {
        return this.pitchingGroundOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingHitByPitch() {
        return this.pitchingHitByPitch;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingHitsAllowed() {
        return this.pitchingHitsAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingHitsPer9Inn() {
        return this.pitchingHitsPer9Inn;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingHomeRuns() {
        return this.pitchingHomeRuns;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingHomeRunsPer9() {
        return this.pitchingHomeRunsPer9;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingInheritedRunners() {
        return this.pitchingInheritedRunners;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingInheritedRunnersScored() {
        return this.pitchingInheritedRunnersScored;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingLosses() {
        return this.pitchingLosses;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingNumberOfPitches() {
        return this.pitchingNumberOfPitches;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingObp() {
        return this.pitchingObp;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingOpponentBattingAvg() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingOpsAllowed() {
        return this.pitchingOpsAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingPickoffs() {
        return this.pitchingPickoffs;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingPitchesPerBatterFaced() {
        return this.pitchingPitchesPerBatterFaced;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingPitchesPerInning() {
        return this.pitchingPitchesPerInning;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingQualityStarts() {
        return this.pitchingQualityStarts;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingSaveOpportunities() {
        return this.pitchingSaveOpportunities;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingSaves() {
        return this.pitchingSaves;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingShutouts() {
        return this.pitchingShutouts;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingSinglesAllowed() {
        return this.pitchingSinglesAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingSlg() {
        return this.pitchingSlg;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingStrikeoutWalkRatio() {
        return this.pitchingStrikeoutWalkRatio;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingStrikeoutsPer9Inn() {
        return this.pitchingStrikeoutsPer9Inn;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingStrikes() {
        return this.pitchingStrikes;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingTotalBasesAllowed() {
        return this.pitchingTotalBasesAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingTriplesAllowed() {
        return this.pitchingTriplesAllowed;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingWhip() {
        return this.pitchingWhip;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingWildPitches() {
        return this.pitchingWildPitches;
    }

    @Nullable
    public final BaseballRankedStatistic getPitchingWins() {
        return this.pitchingWins;
    }

    @Nullable
    public final BaseballRankedStatistic getWar() {
        return this.war;
    }

    public BaseballRankedStatistics(@Nullable BaseballRankedStatistic baseballRankedStatistic, @Nullable BaseballRankedStatistic baseballRankedStatistic2, @Nullable BaseballRankedStatistic baseballRankedStatistic3, @Nullable BaseballRankedStatistic baseballRankedStatistic4, @Nullable BaseballRankedStatistic baseballRankedStatistic5, @Nullable BaseballRankedStatistic baseballRankedStatistic6, @Nullable BaseballRankedStatistic baseballRankedStatistic7, @Nullable BaseballRankedStatistic baseballRankedStatistic8, @Nullable BaseballRankedStatistic baseballRankedStatistic9, @Nullable BaseballRankedStatistic baseballRankedStatistic10, @Nullable BaseballRankedStatistic baseballRankedStatistic11, @Nullable BaseballRankedStatistic baseballRankedStatistic12, @Nullable BaseballRankedStatistic baseballRankedStatistic13, @Nullable BaseballRankedStatistic baseballRankedStatistic14, @Nullable BaseballRankedStatistic baseballRankedStatistic15, @Nullable BaseballRankedStatistic baseballRankedStatistic16, @Nullable BaseballRankedStatistic baseballRankedStatistic17, @Nullable BaseballRankedStatistic baseballRankedStatistic18, @Nullable BaseballRankedStatistic baseballRankedStatistic19, @Nullable BaseballRankedStatistic baseballRankedStatistic20, @Nullable BaseballRankedStatistic baseballRankedStatistic21, @Nullable BaseballRankedStatistic baseballRankedStatistic22, @Nullable BaseballRankedStatistic baseballRankedStatistic23, @Nullable BaseballRankedStatistic baseballRankedStatistic24, @Nullable BaseballRankedStatistic baseballRankedStatistic25, @Nullable BaseballRankedStatistic baseballRankedStatistic26, @Nullable BaseballRankedStatistic baseballRankedStatistic27, @Nullable BaseballRankedStatistic baseballRankedStatistic28, @Nullable BaseballRankedStatistic baseballRankedStatistic29, @Nullable BaseballRankedStatistic baseballRankedStatistic30, @Nullable BaseballRankedStatistic baseballRankedStatistic31, @Nullable BaseballRankedStatistic baseballRankedStatistic32, @Nullable BaseballRankedStatistic baseballRankedStatistic33, @Nullable BaseballRankedStatistic baseballRankedStatistic34, @Nullable BaseballRankedStatistic baseballRankedStatistic35, @Nullable BaseballRankedStatistic baseballRankedStatistic36, @Nullable BaseballRankedStatistic baseballRankedStatistic37, @Nullable BaseballRankedStatistic baseballRankedStatistic38, @Nullable BaseballRankedStatistic baseballRankedStatistic39, @Nullable BaseballRankedStatistic baseballRankedStatistic40, @Nullable BaseballRankedStatistic baseballRankedStatistic41, @Nullable BaseballRankedStatistic baseballRankedStatistic42, @Nullable BaseballRankedStatistic baseballRankedStatistic43, @Nullable BaseballRankedStatistic baseballRankedStatistic44, @Nullable BaseballRankedStatistic baseballRankedStatistic45, @Nullable BaseballRankedStatistic baseballRankedStatistic46, @Nullable BaseballRankedStatistic baseballRankedStatistic47, @Nullable BaseballRankedStatistic baseballRankedStatistic48, @Nullable BaseballRankedStatistic baseballRankedStatistic49, @Nullable BaseballRankedStatistic baseballRankedStatistic50, @Nullable BaseballRankedStatistic baseballRankedStatistic51, @Nullable BaseballRankedStatistic baseballRankedStatistic52, @Nullable BaseballRankedStatistic baseballRankedStatistic53, @Nullable BaseballRankedStatistic baseballRankedStatistic54, @Nullable BaseballRankedStatistic baseballRankedStatistic55, @Nullable BaseballRankedStatistic baseballRankedStatistic56, @Nullable BaseballRankedStatistic baseballRankedStatistic57, @Nullable BaseballRankedStatistic baseballRankedStatistic58, @Nullable BaseballRankedStatistic baseballRankedStatistic59, @Nullable BaseballRankedStatistic baseballRankedStatistic60, @Nullable BaseballRankedStatistic baseballRankedStatistic61, @Nullable BaseballRankedStatistic baseballRankedStatistic62, @Nullable BaseballRankedStatistic baseballRankedStatistic63, @Nullable BaseballRankedStatistic baseballRankedStatistic64, @Nullable BaseballRankedStatistic baseballRankedStatistic65, @Nullable BaseballRankedStatistic baseballRankedStatistic66, @Nullable BaseballRankedStatistic baseballRankedStatistic67, @Nullable BaseballRankedStatistic baseballRankedStatistic68, @Nullable BaseballRankedStatistic baseballRankedStatistic69, @Nullable BaseballRankedStatistic baseballRankedStatistic70, @Nullable BaseballRankedStatistic baseballRankedStatistic71, @Nullable BaseballRankedStatistic baseballRankedStatistic72, @Nullable BaseballRankedStatistic baseballRankedStatistic73, @Nullable BaseballRankedStatistic baseballRankedStatistic74, @Nullable BaseballRankedStatistic baseballRankedStatistic75, @Nullable BaseballRankedStatistic baseballRankedStatistic76, @Nullable BaseballRankedStatistic baseballRankedStatistic77, @Nullable BaseballRankedStatistic baseballRankedStatistic78, @Nullable BaseballRankedStatistic baseballRankedStatistic79, @Nullable BaseballRankedStatistic baseballRankedStatistic80, @Nullable BaseballRankedStatistic baseballRankedStatistic81, @Nullable BaseballRankedStatistic baseballRankedStatistic82, @Nullable BaseballRankedStatistic baseballRankedStatistic83, @Nullable BaseballRankedStatistic baseballRankedStatistic84, @Nullable BaseballRankedStatistic baseballRankedStatistic85, @Nullable BaseballRankedStatistic baseballRankedStatistic86, @Nullable BaseballRankedStatistic baseballRankedStatistic87, @Nullable BaseballRankedStatistic baseballRankedStatistic88, @Nullable BaseballRankedStatistic baseballRankedStatistic89, @Nullable BaseballRankedStatistic baseballRankedStatistic90, @Nullable BaseballRankedStatistic baseballRankedStatistic91, @Nullable BaseballRankedStatistic baseballRankedStatistic92, @Nullable BaseballRankedStatistic baseballRankedStatistic93, @Nullable BaseballRankedStatistic baseballRankedStatistic94, @Nullable BaseballRankedStatistic baseballRankedStatistic95, @Nullable BaseballRankedStatistic baseballRankedStatistic96, @Nullable BaseballRankedStatistic baseballRankedStatistic97, @Nullable BaseballRankedStatistic baseballRankedStatistic98, @Nullable BaseballRankedStatistic baseballRankedStatistic99, @Nullable BaseballRankedStatistic baseballRankedStatistic100, @Nullable BaseballRankedStatistic baseballRankedStatistic101, @Nullable BaseballRankedStatistic baseballRankedStatistic102, @Nullable BaseballRankedStatistic baseballRankedStatistic103, @Nullable BaseballRankedStatistic baseballRankedStatistic104, @Nullable BaseballRankedStatistic baseballRankedStatistic105, @Nullable BaseballRankedStatistic baseballRankedStatistic106, @Nullable BaseballRankedStatistic baseballRankedStatistic107, @Nullable BaseballRankedStatistic baseballRankedStatistic108, @Nullable BaseballRankedStatistic baseballRankedStatistic109, @Nullable BaseballRankedStatistic baseballRankedStatistic110, @Nullable BaseballRankedStatistic baseballRankedStatistic111, @Nullable BaseballRankedStatistic baseballRankedStatistic112, @Nullable BaseballRankedStatistic baseballRankedStatistic113, @Nullable BaseballRankedStatistic baseballRankedStatistic114, @Nullable BaseballRankedStatistic baseballRankedStatistic115, @Nullable BaseballRankedStatistic baseballRankedStatistic116, @Nullable BaseballRankedStatistic baseballRankedStatistic117, @Nullable BaseballRankedStatistic baseballRankedStatistic118, @Nullable BaseballRankedStatistic baseballRankedStatistic119) {
        this.battingGamesPlayed = baseballRankedStatistic;
        this.war = baseballRankedStatistic2;
        this.oWar = baseballRankedStatistic3;
        this.battingPlateAppearances = baseballRankedStatistic4;
        this.battingAtBats = baseballRankedStatistic5;
        this.battingBaseOnBalls = baseballRankedStatistic6;
        this.battingIntentionalWalks = baseballRankedStatistic7;
        this.battingHitByPitch = baseballRankedStatistic8;
        this.battingStrikeOuts = baseballRankedStatistic9;
        this.battingStrikeoutsLooking = baseballRankedStatistic10;
        this.battingStrikeoutsSwinging = baseballRankedStatistic11;
        this.battingAtBatsPerStrikeout = baseballRankedStatistic12;
        this.battingWalkToStrikeoutRatio = baseballRankedStatistic13;
        this.battingWalkRate = baseballRankedStatistic14;
        this.battingHits = baseballRankedStatistic15;
        this.battingSingles = baseballRankedStatistic16;
        this.battingDoubles = baseballRankedStatistic17;
        this.battingTriples = baseballRankedStatistic18;
        this.battingHomeRuns = baseballRankedStatistic19;
        this.battingTotalBases = baseballRankedStatistic20;
        this.battingBabip = baseballRankedStatistic21;
        this.battingRuns = baseballRankedStatistic22;
        this.battingRbi = baseballRankedStatistic23;
        this.battingLeftOnBase = baseballRankedStatistic24;
        this.battingRunsCreated = baseballRankedStatistic25;
        this.battingRunsCreatedPer27Outs = baseballRankedStatistic26;
        this.battingAvg = baseballRankedStatistic27;
        this.battingSluggingPercentage = baseballRankedStatistic28;
        this.battingOnBasePercentage = baseballRankedStatistic29;
        this.battingOps = baseballRankedStatistic30;
        this.battingOpsAdjusted = baseballRankedStatistic31;
        this.battingIsolatedPower = baseballRankedStatistic32;
        this.battingAbPerHomeRun = baseballRankedStatistic33;
        this.battingAtBatsWithRisp = baseballRankedStatistic34;
        this.battingHitsWithRisp = baseballRankedStatistic35;
        this.battingSacFlies = baseballRankedStatistic36;
        this.battingSacBunts = baseballRankedStatistic37;
        this.battingStolenBases = baseballRankedStatistic38;
        this.battingCaughtStealing = baseballRankedStatistic39;
        this.battingStolenBasePercentage = baseballRankedStatistic40;
        this.battingGroundOuts = baseballRankedStatistic41;
        this.battingFlyOuts = baseballRankedStatistic42;
        this.battingLineOuts = baseballRankedStatistic43;
        this.battingPopOuts = baseballRankedStatistic44;
        this.battingLineDrives = baseballRankedStatistic45;
        this.battingGroundBalls = baseballRankedStatistic46;
        this.battingPopUps = baseballRankedStatistic47;
        this.battingFlyBalls = baseballRankedStatistic48;
        this.battingGroundedIntoDoublePlay = baseballRankedStatistic49;
        this.battingFlyIntoDoublePlay = baseballRankedStatistic50;
        this.battingLineIntoDoublePlay = baseballRankedStatistic51;
        this.pitchingWins = baseballRankedStatistic52;
        this.pitchingLosses = baseballRankedStatistic53;
        this.pitchingGamesPlayed = baseballRankedStatistic54;
        this.pitchingGamesStarted = baseballRankedStatistic55;
        this.pitchingGamesFinished = baseballRankedStatistic56;
        this.pitchingQualityStarts = baseballRankedStatistic57;
        this.pitchingGamesCompleted = baseballRankedStatistic58;
        this.pitchingShutouts = baseballRankedStatistic59;
        this.pitchingSaves = baseballRankedStatistic60;
        this.pitchingSaveOpportunities = baseballRankedStatistic61;
        this.pitchingBlownSaves = baseballRankedStatistic62;
        this.pitchingInheritedRunners = baseballRankedStatistic63;
        this.pitchingInheritedRunnersScored = baseballRankedStatistic64;
        this.pitchingInningsPitched = baseballRankedStatistic65;
        this.pitchingBattersFaced = baseballRankedStatistic66;
        this.pitchingNumberOfPitches = baseballRankedStatistic67;
        this.pitchingStrikes = baseballRankedStatistic68;
        this.pitchingPitchesPerInning = baseballRankedStatistic69;
        this.pitchingPitchesPerBatterFaced = baseballRankedStatistic70;
        this.pitchingEarnedRuns = baseballRankedStatistic71;
        this.pitchingEarnedRunsAverage = baseballRankedStatistic72;
        this.pitchingWhip = baseballRankedStatistic73;
        this.pitchingStrikeoutsPer9Inn = baseballRankedStatistic74;
        this.pitchingStrikeoutWalkRatio = baseballRankedStatistic75;
        this.pitchingStrikeOuts = baseballRankedStatistic76;
        this.pitchingGroundOuts = baseballRankedStatistic77;
        this.pitchingBalks = baseballRankedStatistic78;
        this.pitchingWildPitches = baseballRankedStatistic79;
        this.pitchingPickoffs = baseballRankedStatistic80;
        this.pitchingFieldingIndependentPitching = baseballRankedStatistic81;
        this.pitchingHitsAllowed = baseballRankedStatistic82;
        this.pitchingSinglesAllowed = baseballRankedStatistic83;
        this.pitchingDoublesAllowed = baseballRankedStatistic84;
        this.pitchingTriplesAllowed = baseballRankedStatistic85;
        this.pitchingHomeRuns = baseballRankedStatistic86;
        this.pitchingTotalBasesAllowed = baseballRankedStatistic87;
        this.pitchingHitsPer9Inn = baseballRankedStatistic88;
        this.pitchingHomeRunsPer9 = baseballRankedStatistic89;
        this.pitchingBaseOnBalls = baseballRankedStatistic90;
        this.pitchingHitByPitch = baseballRankedStatistic91;
        this.pitchingOpponentBattingAvg = baseballRankedStatistic92;
        this.pitchingObp = baseballRankedStatistic93;
        this.pitchingSlg = baseballRankedStatistic94;
        this.pitchingOpsAllowed = baseballRankedStatistic95;
        this.pitchingGroundBallFlyBallRatio = baseballRankedStatistic96;
        this.pitchingGroundBallsAllowed = baseballRankedStatistic97;
        this.pitchingFlyBallsAllowed = baseballRankedStatistic98;
        this.fieldingGamesPlayed = baseballRankedStatistic99;
        this.fieldingGamesStarted = baseballRankedStatistic100;
        this.fieldingGamesFinished = baseballRankedStatistic101;
        this.fieldingGamesCompleted = baseballRankedStatistic102;
        this.fieldingPutOuts = baseballRankedStatistic103;
        this.fieldingAssists = baseballRankedStatistic104;
        this.fieldingTotalErrors = baseballRankedStatistic105;
        this.fieldingDoublePlays = baseballRankedStatistic106;
        this.fieldingChances = baseballRankedStatistic107;
        this.fieldingFielding = baseballRankedStatistic108;
        this.fieldingRangeFactorPerGame = baseballRankedStatistic109;
        this.fieldingInnings = baseballRankedStatistic110;
        this.fieldingThrowingErrors = baseballRankedStatistic111;
        this.fieldingFieldingErrors = baseballRankedStatistic112;
        this.fieldingInterferenceErrors = baseballRankedStatistic113;
        this.fieldingCatcherWildPitches = baseballRankedStatistic114;
        this.fieldingPassedBalls = baseballRankedStatistic115;
        this.fieldingCaughtStealing = baseballRankedStatistic116;
        this.fieldingStolenBasesAllowed = baseballRankedStatistic117;
        this.fieldingStolenBasePercentageAgainst = baseballRankedStatistic118;
        this.fieldingPickoffs = baseballRankedStatistic119;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballRankedStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
