package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "", "<init>", "()V", "Companion", "Index", "ContentId", "a", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom$ContentId;", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom$Index;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BlazeWidgetPlayFrom {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom$ContentId;", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "contentId", "", "<init>", "(Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentId extends BlazeWidgetPlayFrom {
        public static final int $stable = 0;

        @NotNull
        private final String contentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentId(@NotNull String str) {
            super(null);
            str.getClass();
            this.contentId = str;
        }

        public static /* synthetic */ ContentId copy$default(ContentId contentId, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentId.contentId;
            }
            return contentId.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        @NotNull
        public final ContentId copy(@NotNull String contentId) {
            contentId.getClass();
            return new ContentId(contentId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentId) && Intrinsics.c(this.contentId, ((ContentId) other).contentId);
        }

        @NotNull
        public final String getContentId() {
            return this.contentId;
        }

        public int hashCode() {
            return this.contentId.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.q(new StringBuilder("ContentId(contentId="), this.contentId, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom$Index;", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "index", "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Index extends BlazeWidgetPlayFrom {
        public static final int $stable = 0;
        private final int index;

        public Index(int i) {
            super(null);
            this.index = i;
        }

        public static /* synthetic */ Index copy$default(Index index, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = index.index;
            }
            return index.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final Index copy(int index) {
            return new Index(index);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Index) && this.index == ((Index) other).index;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        @NotNull
        public String toString() {
            return wv8.j(new StringBuilder("Index(index="), this.index, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ BlazeWidgetPlayFrom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* renamed from: default, reason: not valid java name */
    public static final BlazeWidgetPlayFrom m24default() {
        INSTANCE.getClass();
        return new Index(0);
    }

    private BlazeWidgetPlayFrom() {
    }
}
