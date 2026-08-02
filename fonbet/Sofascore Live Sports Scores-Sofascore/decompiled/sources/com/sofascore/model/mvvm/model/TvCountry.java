package com.sofascore.model.mvvm.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/sofascore/model/mvvm/model/TvCountry;", "", "countryCode", "", "channels", "", "Lcom/sofascore/model/mvvm/model/TvChannel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCountryCode", "()Ljava/lang/String;", "getChannels", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TvCountry {

    @NotNull
    private final List<TvChannel> channels;

    @NotNull
    private final String countryCode;

    public TvCountry(@NotNull String str, @NotNull List<TvChannel> list) {
        str.getClass();
        list.getClass();
        this.countryCode = str;
        this.channels = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !TvCountry.class.equals(other.getClass())) {
            return false;
        }
        return Intrinsics.c(this.countryCode, ((TvCountry) other).countryCode);
    }

    @NotNull
    public final List<TvChannel> getChannels() {
        return this.channels;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return this.countryCode.hashCode();
    }
}
