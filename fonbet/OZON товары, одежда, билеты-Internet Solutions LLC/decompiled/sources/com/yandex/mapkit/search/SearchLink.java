package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Attribution;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class SearchLink implements Serializable {
    private String aref;
    private Attribution.Link link;
    private String tag;

    public SearchLink(String str, @NonNull Attribution.Link link, String str2) {
        if (link == null) {
            throw new IllegalArgumentException("Required field \"link\" cannot be null");
        }
        this.aref = str;
        this.link = link;
        this.tag = str2;
    }

    public String getAref() {
        return this.aref;
    }

    @NonNull
    public Attribution.Link getLink() {
        return this.link;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.aref = archive.add(this.aref, true);
        this.link = (Attribution.Link) archive.add((Archive) this.link, false, (Class<Archive>) Attribution.Link.class);
        this.tag = archive.add(this.tag, true);
    }

    public SearchLink() {
    }
}
