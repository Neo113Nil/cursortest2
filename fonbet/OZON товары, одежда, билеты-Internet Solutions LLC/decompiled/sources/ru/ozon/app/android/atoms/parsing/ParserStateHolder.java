package ru.ozon.app.android.atoms.parsing;

import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.parsing.adapter.AtomDTOAdapterFactory;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/parsing/ParserStateHolder;", "", "<init>", "()V", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi$design_system_release", "()Lcom/squareup/moshi/Moshi;", "Lru/ozon/app/android/atoms/parsing/ParseState;", "config", "Lru/ozon/app/android/atoms/parsing/ParseState;", "getConfig$design_system_release", "()Lru/ozon/app/android/atoms/parsing/ParseState;", "setConfig$design_system_release", "(Lru/ozon/app/android/atoms/parsing/ParseState;)V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParserStateHolder {
    public static final int $stable;

    @NotNull
    public static final ParserStateHolder INSTANCE = new ParserStateHolder();
    private static final Moshi moshi;

    static {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new AtomDTOAdapterFactory());
        moshi = new Moshi(aVar);
        $stable = 8;
    }

    private ParserStateHolder() {
    }

    @NotNull
    public final ParseState getConfig$design_system_release() {
        Intrinsics.n("config");
        throw null;
    }
}
