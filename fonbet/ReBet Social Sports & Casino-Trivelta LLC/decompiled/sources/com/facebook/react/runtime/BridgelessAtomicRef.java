package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001a\u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0011\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u000b\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007R \u0010\u0003\u001a\u0004\u0018\u00018\u00008GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001e\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\u0005R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef;", "T", "", EventKeys.VALUE_KEY, "<init>", "(Ljava/lang/Object;)V", "getNullable", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "initialValue", "getInitialValue", "setInitialValue", "state", "Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", "failureMessage", "", "getOrCreate", "provider", "Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "(Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;)Ljava/lang/Object;", "andReset", "getAndReset", "reset", "", "get", "Provider", "State", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BridgelessAtomicRef<T> {

    @NotNull
    private volatile String failureMessage;

    @Nullable
    private T initialValue;

    @NotNull
    private volatile State state;

    @Nullable
    private volatile T value;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "T", "", "get", "()Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Provider<T> {
        T get();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", "", "<init>", "(Ljava/lang/String;I)V", "Init", "Creating", "Success", "Failure", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Init = new State("Init", 0);
        public static final State Creating = new State("Creating", 1);
        public static final State Success = new State("Success", 2);
        public static final State Failure = new State("Failure", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{Init, Creating, Success, Failure};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BridgelessAtomicRef() {
        this(r0, 1, r0);
        DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public final synchronized T get() {
        T t10;
        t10 = this.value;
        if (t10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return t10;
    }

    public final synchronized T getAndReset() {
        T t10;
        t10 = get();
        reset();
        return t10;
    }

    @Nullable
    public final T getInitialValue() {
        return this.initialValue;
    }

    @JvmName(name = "getNullable")
    @Nullable
    public final synchronized T getNullable() {
        return this.value;
    }

    @SuppressLint({"CatchGeneralException"})
    public final T getOrCreate(@NotNull Provider<T> provider) {
        boolean z10;
        T t10;
        T t11;
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this) {
            State state = this.state;
            State state2 = State.Success;
            if (state == state2) {
                return get();
            }
            if (this.state == State.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
            }
            State state3 = this.state;
            State state4 = State.Creating;
            boolean z11 = false;
            if (state3 != state4) {
                this.state = state4;
                z10 = true;
            } else {
                z10 = false;
            }
            Unit unit = Unit.INSTANCE;
            if (z10) {
                try {
                    this.value = provider.get();
                    synchronized (this) {
                        this.state = state2;
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        t10 = get();
                    }
                    return t10;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.state = State.Failure;
                        this.failureMessage = String.valueOf(e10.getMessage());
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        Unit unit2 = Unit.INSTANCE;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.state == State.Creating) {
                    try {
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                if (this.state == State.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                }
                t11 = get();
            }
            return t11;
        }
    }

    public final synchronized void reset() {
        this.value = this.initialValue;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public final void setInitialValue(@Nullable T t10) {
        this.initialValue = t10;
    }

    public final void setValue(@Nullable T t10) {
        this.value = t10;
    }

    public BridgelessAtomicRef(@Nullable T t10) {
        this.value = t10;
        this.initialValue = this.value;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public /* synthetic */ BridgelessAtomicRef(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
