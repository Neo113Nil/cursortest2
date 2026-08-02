package com.reactnativekeyboardcontroller.events;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardTransitionEvent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "event", "Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion$EventName;", "height", "", "progress", "duration", TypedValues.AttributesType.S_TARGET, "<init>", "(IILcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion$EventName;DDII)V", "getEventName", "", "canCoalesce", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KeyboardTransitionEvent extends Event<KeyboardTransitionEvent> {
    private final int duration;
    private final Companion.EventName event;
    private final double height;
    private final double progress;
    private final int target;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Companion.EventName Move = Companion.EventName.Move;
    private static final Companion.EventName Start = Companion.EventName.Start;
    private static final Companion.EventName End = Companion.EventName.End;
    private static final Companion.EventName Interactive = Companion.EventName.Interactive;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardTransitionEvent(int i, int i2, Companion.EventName event, double d, double d2, int i3, int i4) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
        this.height = d;
        this.progress = d2;
        this.duration = i3;
        this.target = i4;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.event.getValue();
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getPayload() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("progress", this.progress);
        createMap.putDouble("height", this.height);
        createMap.putInt("duration", this.duration);
        createMap.putInt(TypedValues.AttributesType.S_TARGET, this.target);
        return createMap;
    }

    /* compiled from: KeyboardTransitionEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion;", "", "<init>", "()V", "Move", "Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion$EventName;", "getMove", "()Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion$EventName;", "Start", "getStart", "End", "getEnd", "Interactive", "getInteractive", "EventName", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: KeyboardTransitionEvent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/reactnativekeyboardcontroller/events/KeyboardTransitionEvent$Companion$EventName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Move", "Start", "End", "Interactive", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EventName {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EventName[] $VALUES;
            private final String value;
            public static final EventName Move = new EventName("Move", 0, "topKeyboardMove");
            public static final EventName Start = new EventName("Start", 1, "topKeyboardMoveStart");
            public static final EventName End = new EventName("End", 2, "topKeyboardMoveEnd");
            public static final EventName Interactive = new EventName("Interactive", 3, "topKeyboardMoveInteractive");

            private static final /* synthetic */ EventName[] $values() {
                return new EventName[]{Move, Start, End, Interactive};
            }

            public static EnumEntries<EventName> getEntries() {
                return $ENTRIES;
            }

            private EventName(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                EventName[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static EventName valueOf(String str) {
                return (EventName) Enum.valueOf(EventName.class, str);
            }

            public static EventName[] values() {
                return (EventName[]) $VALUES.clone();
            }
        }

        private Companion() {
        }

        public final EventName getMove() {
            return KeyboardTransitionEvent.Move;
        }

        public final EventName getStart() {
            return KeyboardTransitionEvent.Start;
        }

        public final EventName getEnd() {
            return KeyboardTransitionEvent.End;
        }

        public final EventName getInteractive() {
            return KeyboardTransitionEvent.Interactive;
        }
    }
}
