package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Annotation implements Serializable {
    private Action action;
    private ActionMetadata actionMetadata;
    private boolean actionMetadata__is_initialized;
    private boolean action__is_initialized;
    private String descriptionText;
    private boolean descriptionText__is_initialized;
    private List<Landmark> landmarks;
    private boolean landmarks__is_initialized;
    private NativeObject nativeObject;
    private String toponym;
    private ToponymPhrase toponymPhrase;
    private boolean toponymPhrase__is_initialized;
    private boolean toponym__is_initialized;

    public Annotation() {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
    }

    private native ActionMetadata getActionMetadata__Native();

    private native Action getAction__Native();

    private native String getDescriptionText__Native();

    private native List<Landmark> getLandmarks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Annotation";
    }

    private native ToponymPhrase getToponymPhrase__Native();

    private native String getToponym__Native();

    private native NativeObject init(Action action, String str, String str2, ActionMetadata actionMetadata, List<Landmark> list, ToponymPhrase toponymPhrase);

    public synchronized Action getAction() {
        try {
            if (!this.action__is_initialized) {
                this.action = getAction__Native();
                this.action__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.action;
    }

    @NonNull
    public synchronized ActionMetadata getActionMetadata() {
        try {
            if (!this.actionMetadata__is_initialized) {
                this.actionMetadata = getActionMetadata__Native();
                this.actionMetadata__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.actionMetadata;
    }

    @NonNull
    public synchronized String getDescriptionText() {
        try {
            if (!this.descriptionText__is_initialized) {
                this.descriptionText = getDescriptionText__Native();
                this.descriptionText__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.descriptionText;
    }

    @NonNull
    public synchronized List<Landmark> getLandmarks() {
        try {
            if (!this.landmarks__is_initialized) {
                this.landmarks = getLandmarks__Native();
                this.landmarks__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.landmarks;
    }

    public synchronized String getToponym() {
        try {
            if (!this.toponym__is_initialized) {
                this.toponym = getToponym__Native();
                this.toponym__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toponym;
    }

    public synchronized ToponymPhrase getToponymPhrase() {
        try {
            if (!this.toponymPhrase__is_initialized) {
                this.toponymPhrase = getToponymPhrase__Native();
                this.toponymPhrase__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toponymPhrase;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAction(), true, (Class<Archive>) Action.class);
            archive.add(getToponym(), true);
            archive.add(getDescriptionText(), false);
            archive.add((Archive) getActionMetadata(), false, (Class<Archive>) ActionMetadata.class);
            archive.add((List) getLandmarks(), false, (ArchivingHandler) new EnumHandler(Landmark.class));
            archive.add((Archive) getToponymPhrase(), true, (Class<Archive>) ToponymPhrase.class);
            return;
        }
        this.action = (Action) archive.add((Archive) this.action, true, (Class<Archive>) Action.class);
        this.action__is_initialized = true;
        this.toponym = archive.add(this.toponym, true);
        this.toponym__is_initialized = true;
        this.descriptionText = archive.add(this.descriptionText, false);
        this.descriptionText__is_initialized = true;
        this.actionMetadata = (ActionMetadata) archive.add((Archive) this.actionMetadata, false, (Class<Archive>) ActionMetadata.class);
        this.actionMetadata__is_initialized = true;
        this.landmarks = archive.add((List) this.landmarks, false, (ArchivingHandler) new EnumHandler(Landmark.class));
        this.landmarks__is_initialized = true;
        ToponymPhrase toponymPhrase = (ToponymPhrase) archive.add((Archive) this.toponymPhrase, true, (Class<Archive>) ToponymPhrase.class);
        this.toponymPhrase = toponymPhrase;
        this.toponymPhrase__is_initialized = true;
        this.nativeObject = init(this.action, this.toponym, this.descriptionText, this.actionMetadata, this.landmarks, toponymPhrase);
    }

    public Annotation(Action action, String str, @NonNull String str2, @NonNull ActionMetadata actionMetadata, @NonNull List<Landmark> list, ToponymPhrase toponymPhrase) {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"descriptionText\" cannot be null");
        }
        if (actionMetadata == null) {
            throw new IllegalArgumentException("Required field \"actionMetadata\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(action, str, str2, actionMetadata, list, toponymPhrase);
            this.action = action;
            this.action__is_initialized = true;
            this.toponym = str;
            this.toponym__is_initialized = true;
            this.descriptionText = str2;
            this.descriptionText__is_initialized = true;
            this.actionMetadata = actionMetadata;
            this.actionMetadata__is_initialized = true;
            this.landmarks = list;
            this.landmarks__is_initialized = true;
            this.toponymPhrase = toponymPhrase;
            this.toponymPhrase__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"landmarks\" cannot be null");
    }

    private Annotation(NativeObject nativeObject) {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
