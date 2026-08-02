package ru.ozon.uni.core.compose.tokens;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/core/compose/tokens/UniComposeColorToken;", "", "Ll1/Z;", "lightColor", "darkColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getLightColor-0d7_KjU", "()J", "getDarkColor-0d7_KjU", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniComposeColorToken {
    private final long darkColor;
    private final long lightColor;

    public /* synthetic */ UniComposeColorToken(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    /* renamed from: getDarkColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDarkColor() {
        return this.darkColor;
    }

    /* renamed from: getLightColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLightColor() {
        return this.lightColor;
    }

    private UniComposeColorToken(long j11, long j12) {
        this.lightColor = j11;
        this.darkColor = j12;
    }
}
