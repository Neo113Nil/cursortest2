package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class State implements Serializable {
    private Boolean isOpenNow;
    private boolean isOpenNow__is_initialized;
    private NativeObject nativeObject;
    private String shortText;
    private boolean shortText__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String text;
    private boolean text__is_initialized;

    public State() {
        this.isOpenNow__is_initialized = false;
        this.text__is_initialized = false;
        this.shortText__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private native Boolean getIsOpenNow__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::State";
    }

    private native String getShortText__Native();

    private native List<String> getTags__Native();

    private native String getText__Native();

    private native NativeObject init(Boolean bool, String str, String str2, List<String> list);

    public synchronized Boolean getIsOpenNow() {
        try {
            if (!this.isOpenNow__is_initialized) {
                this.isOpenNow = getIsOpenNow__Native();
                this.isOpenNow__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isOpenNow;
    }

    public synchronized String getShortText() {
        try {
            if (!this.shortText__is_initialized) {
                this.shortText = getShortText__Native();
                this.shortText__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.shortText;
    }

    @NonNull
    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.tags;
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getIsOpenNow(), true);
            archive.add(getText(), true);
            archive.add(getShortText(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.isOpenNow = archive.add(this.isOpenNow, true);
        this.isOpenNow__is_initialized = true;
        this.text = archive.add(this.text, true);
        this.text__is_initialized = true;
        this.shortText = archive.add(this.shortText, true);
        this.shortText__is_initialized = true;
        List<String> add = archive.add((List) this.tags, false, (ArchivingHandler) new StringHandler());
        this.tags = add;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.isOpenNow, this.text, this.shortText, add);
    }

    public State(Boolean bool, String str, String str2, @NonNull List<String> list) {
        this.isOpenNow__is_initialized = false;
        this.text__is_initialized = false;
        this.shortText__is_initialized = false;
        this.tags__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(bool, str, str2, list);
            this.isOpenNow = bool;
            this.isOpenNow__is_initialized = true;
            this.text = str;
            this.text__is_initialized = true;
            this.shortText = str2;
            this.shortText__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"tags\" cannot be null");
    }

    private State(NativeObject nativeObject) {
        this.isOpenNow__is_initialized = false;
        this.text__is_initialized = false;
        this.shortText__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
