package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackEvent;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackEvent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FeedbackEvent[] $VALUES;
    public static final FeedbackEvent SUCCESS = new FeedbackEvent("SUCCESS", 0);
    public static final FeedbackEvent FAILURE = new FeedbackEvent("FAILURE", 1);

    private static final /* synthetic */ FeedbackEvent[] $values() {
        return new FeedbackEvent[]{SUCCESS, FAILURE};
    }

    static {
        FeedbackEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FeedbackEvent(String str, int i11) {
    }

    public static FeedbackEvent valueOf(String str) {
        return (FeedbackEvent) Enum.valueOf(FeedbackEvent.class, str);
    }

    public static FeedbackEvent[] values() {
        return (FeedbackEvent[]) $VALUES.clone();
    }
}
