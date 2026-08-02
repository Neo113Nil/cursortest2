package ru.ozon.uni.android.atom.loader.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "", "<init>", "(Ljava/lang/String;I)V", "LOADER_200", "LOADER_300", "LOADER_400", "LOADER_500", "LOADER_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoaderSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LoaderSize[] $VALUES;
    public static final LoaderSize LOADER_200 = new LoaderSize("LOADER_200", 0);
    public static final LoaderSize LOADER_300 = new LoaderSize("LOADER_300", 1);
    public static final LoaderSize LOADER_400 = new LoaderSize("LOADER_400", 2);
    public static final LoaderSize LOADER_500 = new LoaderSize("LOADER_500", 3);
    public static final LoaderSize LOADER_600 = new LoaderSize("LOADER_600", 4);

    private static final /* synthetic */ LoaderSize[] $values() {
        return new LoaderSize[]{LOADER_200, LOADER_300, LOADER_400, LOADER_500, LOADER_600};
    }

    static {
        LoaderSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LoaderSize(String str, int i11) {
    }

    @NotNull
    public static a<LoaderSize> getEntries() {
        return $ENTRIES;
    }

    public static LoaderSize valueOf(String str) {
        return (LoaderSize) Enum.valueOf(LoaderSize.class, str);
    }

    public static LoaderSize[] values() {
        return (LoaderSize[]) $VALUES.clone();
    }
}
