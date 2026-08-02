package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.KeyValuePair;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SubtitleItem implements Serializable {
    private NativeObject nativeObject;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private String text;
    private boolean text__is_initialized;
    private String type;
    private boolean type__is_initialized;

    public SubtitleItem() {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SubtitleItem";
    }

    private native List<KeyValuePair> getProperties__Native();

    private native String getText__Native();

    private native String getType__Native();

    private native NativeObject init(String str, String str2, List<KeyValuePair> list);

    @NonNull
    public synchronized List<KeyValuePair> getProperties() {
        try {
            if (!this.properties__is_initialized) {
                this.properties = getProperties__Native();
                this.properties__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.properties;
    }

    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.text;
    }

    @NonNull
    public synchronized String getType() {
        try {
            if (!this.type__is_initialized) {
                this.type = getType__Native();
                this.type__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getType(), false);
            archive.add(getText(), true);
            C2616s.f(KeyValuePair.class, archive, getProperties(), false);
            return;
        }
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        this.text = archive.add(this.text, true);
        this.text__is_initialized = true;
        List<KeyValuePair> d11 = G.d(KeyValuePair.class, archive, this.properties, false);
        this.properties = d11;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.type, this.text, d11);
    }

    public SubtitleItem(@NonNull String str, String str2, @NonNull List<KeyValuePair> list) {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, list);
            this.type = str;
            this.type__is_initialized = true;
            this.text = str2;
            this.text__is_initialized = true;
            this.properties = list;
            this.properties__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"properties\" cannot be null");
    }

    private SubtitleItem(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.text__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
