package org.mp4parser;

import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class BasicContainer implements Container {
    private List<Box> boxes;

    public BasicContainer() {
        this.boxes = new ArrayList();
    }

    public BasicContainer(List<Box> list) {
        new ArrayList();
        this.boxes = list;
    }

    @Override // org.mp4parser.Container
    public List<Box> getBoxes() {
        return this.boxes;
    }

    @Override // org.mp4parser.Container
    public void setBoxes(List<? extends Box> list) {
        this.boxes = new ArrayList(list);
    }

    protected long getContainerSize() {
        long j = 0;
        for (int i = 0; i < getBoxes().size(); i++) {
            j += this.boxes.get(i).getSize();
        }
        return j;
    }

    @Override // org.mp4parser.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        ArrayList arrayList = null;
        Box box = null;
        for (Box box2 : getBoxes()) {
            if (cls.isInstance(box2)) {
                if (box == null) {
                    box = box2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(box);
                    }
                    arrayList.add(box2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (box != null) {
            return Collections.singletonList(box);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // org.mp4parser.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        List<Box> boxes = getBoxes();
        for (int i = 0; i < boxes.size(); i++) {
            Box box = boxes.get(i);
            if (cls.isInstance(box)) {
                arrayList.add(box);
            }
            if (z && (box instanceof Container)) {
                arrayList.addAll(((Container) box).getBoxes(cls, z));
            }
        }
        return arrayList;
    }

    public void addBox(Box box) {
        if (box != null) {
            ArrayList arrayList = new ArrayList(getBoxes());
            this.boxes = arrayList;
            arrayList.add(box);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initContainer(ReadableByteChannel readableByteChannel, long j, BoxParser boxParser) throws IOException {
        long j2 = 0;
        while (true) {
            if (j >= 0 && j2 >= j) {
                return;
            }
            try {
                ParsableBox parseBox = boxParser.parseBox(readableByteChannel, this instanceof ParsableBox ? ((ParsableBox) this).getType() : null);
                this.boxes.add(parseBox);
                j2 += parseBox.getSize();
            } catch (EOFException e) {
                if (j >= 0) {
                    throw e;
                }
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.boxes.get(i));
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // org.mp4parser.Container
    public final void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<Box> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }
}
