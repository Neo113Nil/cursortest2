package com.yandex.mapkit.annotations;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class LocalizedPhrase implements Serializable {
    private AnnotationLanguage language;
    private boolean language__is_initialized;
    private NativeObject nativeObject;
    private String text;
    private boolean text__is_initialized;
    private List<SpeakerPhraseToken> tokens;
    private boolean tokens__is_initialized;

    public LocalizedPhrase() {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
    }

    private native AnnotationLanguage getLanguage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::annotations::LocalizedPhrase";
    }

    private native String getText__Native();

    private native List<SpeakerPhraseToken> getTokens__Native();

    private native NativeObject init(List<SpeakerPhraseToken> list, String str, AnnotationLanguage annotationLanguage);

    @NonNull
    public synchronized AnnotationLanguage getLanguage() {
        try {
            if (!this.language__is_initialized) {
                this.language = getLanguage__Native();
                this.language__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.language;
    }

    @NonNull
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
    public synchronized List<SpeakerPhraseToken> getTokens() {
        try {
            if (!this.tokens__is_initialized) {
                this.tokens = getTokens__Native();
                this.tokens__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.tokens;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getTokens(), false, (ArchivingHandler) new EnumHandler(SpeakerPhraseToken.class));
            archive.add(getText(), false);
            archive.add((Archive) getLanguage(), false, (Class<Archive>) AnnotationLanguage.class);
            return;
        }
        this.tokens = archive.add((List) this.tokens, false, (ArchivingHandler) new EnumHandler(SpeakerPhraseToken.class));
        this.tokens__is_initialized = true;
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        AnnotationLanguage annotationLanguage = (AnnotationLanguage) archive.add((Archive) this.language, false, (Class<Archive>) AnnotationLanguage.class);
        this.language = annotationLanguage;
        this.language__is_initialized = true;
        this.nativeObject = init(this.tokens, this.text, annotationLanguage);
    }

    public LocalizedPhrase(@NonNull List<SpeakerPhraseToken> list, @NonNull String str, @NonNull AnnotationLanguage annotationLanguage) {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"tokens\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        if (annotationLanguage != null) {
            this.nativeObject = init(list, str, annotationLanguage);
            this.tokens = list;
            this.tokens__is_initialized = true;
            this.text = str;
            this.text__is_initialized = true;
            this.language = annotationLanguage;
            this.language__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"language\" cannot be null");
    }

    private LocalizedPhrase(NativeObject nativeObject) {
        this.tokens__is_initialized = false;
        this.text__is_initialized = false;
        this.language__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
