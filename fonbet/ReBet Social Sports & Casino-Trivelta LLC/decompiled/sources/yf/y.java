package yf;

import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68404a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Top = new a("Top", 0);
        public static final a Bottom = new a("Bottom", 1);
        public static final a Reconnection = new a("Reconnection", 2);
        public static final a ScrollToMessage = new a("ScrollToMessage", 3);
        public static final a LoadMore = new a("LoadMore", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{Top, Bottom, Reconnection, ScrollToMessage, LoadMore};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public y(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68404a = messagesRepository;
    }

    public static /* synthetic */ Object b(y yVar, String str, String str2, String str3, String str4, String str5, Long l10, Long l11, boolean z10, a aVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            l10 = null;
        }
        if ((i10 & 64) != 0) {
            l11 = null;
        }
        if ((i10 & 128) != 0) {
            z10 = false;
        }
        return yVar.a(str, str2, str3, str4, str5, l10, l11, z10, aVar, continuation);
    }

    public final Object a(String str, String str2, String str3, String str4, String str5, Long l10, Long l11, boolean z10, a aVar, Continuation continuation) {
        return InterfaceC6823a.n(this.f68404a, str, str2, str3, str4, str5, l10, l11, z10, aVar, false, false, continuation, 1536, null);
    }
}
