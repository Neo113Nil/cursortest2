package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Toponym implements Serializable {
    private String accusativeToponym;
    private String toponym;

    public Toponym(String str, String str2) {
        this.toponym = str;
        this.accusativeToponym = str2;
    }

    public String getAccusativeToponym() {
        return this.accusativeToponym;
    }

    public String getToponym() {
        return this.toponym;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.toponym = archive.add(this.toponym, true);
        this.accusativeToponym = archive.add(this.accusativeToponym, true);
    }

    public Toponym() {
    }
}
