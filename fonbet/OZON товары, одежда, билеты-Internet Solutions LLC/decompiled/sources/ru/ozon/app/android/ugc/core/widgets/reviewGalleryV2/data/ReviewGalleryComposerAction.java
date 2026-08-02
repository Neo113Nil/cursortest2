package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "LIKE", "VOTE_MEDIA_LIKE", "VOTE_MEDIA_DISLIKE", "VOTE_MEDIA_REMOVE", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryComposerAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReviewGalleryComposerAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, ReviewGalleryComposerAction> values;

    @NotNull
    private final String id;
    public static final ReviewGalleryComposerAction LIKE = new ReviewGalleryComposerAction("LIKE", 0, "like");
    public static final ReviewGalleryComposerAction VOTE_MEDIA_LIKE = new ReviewGalleryComposerAction("VOTE_MEDIA_LIKE", 1, "voteMediaLike");
    public static final ReviewGalleryComposerAction VOTE_MEDIA_DISLIKE = new ReviewGalleryComposerAction("VOTE_MEDIA_DISLIKE", 2, "voteMediaDislike");
    public static final ReviewGalleryComposerAction VOTE_MEDIA_REMOVE = new ReviewGalleryComposerAction("VOTE_MEDIA_REMOVE", 3, "voteMediaRemove");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReviewGalleryComposerAction fromValue(String value) {
            if (value != null) {
                return (ReviewGalleryComposerAction) ReviewGalleryComposerAction.values.get(value);
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ReviewGalleryComposerAction[] $values() {
        return new ReviewGalleryComposerAction[]{LIKE, VOTE_MEDIA_LIKE, VOTE_MEDIA_DISLIKE, VOTE_MEDIA_REMOVE};
    }

    static {
        ReviewGalleryComposerAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        a<ReviewGalleryComposerAction> entries = getEntries();
        int h11 = U.h(C7714v.z(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (Object obj : entries) {
            linkedHashMap.put(((ReviewGalleryComposerAction) obj).id, obj);
        }
        values = linkedHashMap;
    }

    private ReviewGalleryComposerAction(String str, int i11, String str2) {
        this.id = str2;
    }

    @NotNull
    public static a<ReviewGalleryComposerAction> getEntries() {
        return $ENTRIES;
    }

    public static ReviewGalleryComposerAction valueOf(String str) {
        return (ReviewGalleryComposerAction) Enum.valueOf(ReviewGalleryComposerAction.class, str);
    }

    public static ReviewGalleryComposerAction[] values() {
        return (ReviewGalleryComposerAction[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
