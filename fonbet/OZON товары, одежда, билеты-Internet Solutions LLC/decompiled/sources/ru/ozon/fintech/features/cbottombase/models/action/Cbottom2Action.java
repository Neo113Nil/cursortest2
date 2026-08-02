package ru.ozon.fintech.features.cbottombase.models.action;

import Xc.a;
import Xc.b;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface Cbottom2Action extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SHARE_FILE", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SHARE_FILE = new Type("SHARE_FILE", 0);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SHARE_FILE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @NotNull
    String getId();

    @NotNull
    Type getName();
}
