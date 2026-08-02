package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeChannelItem implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("source")
    private final SchemeStat$TypeChannelSource source;

    public SchemeStat$TypeChannelItem(SchemeStat$TypeChannelSource schemeStat$TypeChannelSource) {
        this.source = schemeStat$TypeChannelSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeChannelItem) && this.source == ((SchemeStat$TypeChannelItem) obj).source;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "TypeChannelItem(source=" + this.source + ')';
    }
}
