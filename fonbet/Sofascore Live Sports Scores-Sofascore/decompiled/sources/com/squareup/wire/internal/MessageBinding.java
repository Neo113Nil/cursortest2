package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Syntax;
import defpackage.gc2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lcom/squareup/wire/internal/MessageBinding;", "", PlayerKt.FOOTBALL_MIDFIELDER, "B", PglCryptUtils.KEY_MESSAGE, "Lgc2;", "unknownFields", "(Ljava/lang/Object;)Lgc2;", "", "getCachedSerializedSize", "(Ljava/lang/Object;)I", "size", "", "setCachedSerializedSize", "(Ljava/lang/Object;I)V", "newBuilder", "()Ljava/lang/Object;", "builder", "build", "(Ljava/lang/Object;)Ljava/lang/Object;", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", U3.i.X, "addUnknownField", "(Ljava/lang/Object;ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "clearUnknownFields", "(Ljava/lang/Object;)V", "Lkotlin/reflect/KClass;", "getMessageType", "()Lkotlin/reflect/KClass;", "messageType", "", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "getFields", "()Ljava/util/Map;", "fields", "", "getTypeUrl", "()Ljava/lang/String;", "typeUrl", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "syntax", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageBinding<M, B> {
    void addUnknownField(@NotNull B builder, int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value);

    @NotNull
    M build(@NotNull B builder);

    void clearUnknownFields(@NotNull B builder);

    int getCachedSerializedSize(@NotNull M message);

    @NotNull
    Map<Integer, FieldOrOneOfBinding<M, B>> getFields();

    @NotNull
    KClass<? super M> getMessageType();

    @NotNull
    Syntax getSyntax();

    @Nullable
    String getTypeUrl();

    @NotNull
    B newBuilder();

    void setCachedSerializedSize(@NotNull M message, int size);

    @NotNull
    gc2 unknownFields(@NotNull M message);
}
