package ru.ozon.app.android.returns.details.data.dto.controls;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "M", "L", "XL", "XXL", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsSizeDto {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RmsSizeDto[] $VALUES;

    /* renamed from: M, reason: collision with root package name */
    @i(name = "m")
    public static final RmsSizeDto f93355M = new RmsSizeDto("M", 0);

    /* renamed from: L, reason: collision with root package name */
    @i(name = "l")
    public static final RmsSizeDto f93354L = new RmsSizeDto("L", 1);

    /* renamed from: XL, reason: collision with root package name */
    @i(name = "xl")
    public static final RmsSizeDto f93356XL = new RmsSizeDto("XL", 2);

    @i(name = "xxl")
    public static final RmsSizeDto XXL = new RmsSizeDto("XXL", 3);

    private static final /* synthetic */ RmsSizeDto[] $values() {
        return new RmsSizeDto[]{f93355M, f93354L, f93356XL, XXL};
    }

    static {
        RmsSizeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private RmsSizeDto(String str, int i11) {
    }

    public static RmsSizeDto valueOf(String str) {
        return (RmsSizeDto) Enum.valueOf(RmsSizeDto.class, str);
    }

    public static RmsSizeDto[] values() {
        return (RmsSizeDto[]) $VALUES.clone();
    }
}
