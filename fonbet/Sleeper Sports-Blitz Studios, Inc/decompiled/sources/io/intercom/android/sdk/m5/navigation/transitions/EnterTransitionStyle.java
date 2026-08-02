package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransitionStyle.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDE_UP", "SLIDE_IN_LEFT", "SLIDE_IN_RIGHT", "NONE", "NULL", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle NONE = new EnterTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public EnterTransition transition() {
            return EnterTransition.INSTANCE.getNone();
        }
    };
    public static final EnterTransitionStyle NULL = new EnterTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public EnterTransition transition() {
            return null;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    };

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, NONE, NULL};
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<EnterTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public abstract EnterTransition transition();

    private EnterTransitionStyle(String str, int i) {
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_UP", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_UP extends EnterTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }

        SLIDE_UP(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public EnterTransition transition() {
            return EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle$SLIDE_UP$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = EnterTransitionStyle.SLIDE_UP.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    static {
        EnterTransitionStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }

        SLIDE_IN_LEFT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public EnterTransition transition() {
            return EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle$SLIDE_IN_LEFT$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = EnterTransitionStyle.SLIDE_IN_LEFT.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return -i;
        }

        SLIDE_IN_RIGHT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public EnterTransition transition() {
            return EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle$SLIDE_IN_RIGHT$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = EnterTransitionStyle.SLIDE_IN_RIGHT.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }
}
