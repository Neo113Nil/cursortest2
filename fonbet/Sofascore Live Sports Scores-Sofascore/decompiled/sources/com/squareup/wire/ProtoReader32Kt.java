package com.squareup.wire;

import defpackage.gc2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a+\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/ProtoReader32;", "Lkotlin/Function1;", "", "", "tagHandler", "Lgc2;", "-forEachTag", "(Lcom/squareup/wire/ProtoReader32;Lkotlin/jvm/functions/Function1;)Lgc2;", "forEachTag", "source", "pos", "limit", "ProtoReader32", "(Lgc2;II)Lcom/squareup/wire/ProtoReader32;", "", "([BII)Lcom/squareup/wire/ProtoReader32;", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtoReader32Kt {
    @NotNull
    /* renamed from: -forEachTag, reason: not valid java name */
    public static final gc2 m716forEachTag(@NotNull ProtoReader32 protoReader32, @NotNull Function1<? super Integer, ? extends Object> function1) {
        protoReader32.getClass();
        function1.getClass();
        int beginMessage = protoReader32.beginMessage();
        while (true) {
            int nextTag = protoReader32.nextTag();
            if (nextTag == -1) {
                return protoReader32.endMessageAndGetUnknownFields(beginMessage);
            }
            function1.invoke(Integer.valueOf(nextTag));
        }
    }

    @NotNull
    public static final ProtoReader32 ProtoReader32(@NotNull gc2 gc2Var, int i, int i2) {
        gc2Var.getClass();
        return new ByteArrayProtoReader32(gc2Var.v(), i, i2);
    }

    public static ProtoReader32 ProtoReader32$default(gc2 gc2Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = gc2Var.h();
        }
        return ProtoReader32(gc2Var, i, i2);
    }

    @NotNull
    public static final ProtoReader32 ProtoReader32(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        return new ByteArrayProtoReader32(bArr, i, i2);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ProtoReader32(bArr, i, i2);
    }
}
